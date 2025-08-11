package Targets;

import processing.core.PApplet;

public class Target {

    float x, y, r, vy;

    enum STATE { ON, OFF, PENDING }

    STATE state;

    Target(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.vy = 0;
        this.state = STATE.PENDING;
    }

    void changeState(STATE state) {
        this.state = state;
    }

    boolean hasBeenShotDown(PApplet p5, Bullet b){
        return (p5.dist(this.x, this.y, b.x, b.y) < p5.max(b.r,this.r));
    }


    void updatePos() {
        vy += 0.3f;
        y += vy;
        if (y > 500) {
            y = 500;
            vy = 0;
        }
    }



    void display(PApplet p5) {
        p5.pushStyle();

        if (state == STATE.PENDING) {
            p5.fill(255, 255, 0);
        } else if (state == STATE.ON) {
            p5.fill(0, 255, 0);
        } else {
            p5.fill(255, 0, 0);
        }

        p5.circle(x, y, r);
        p5.popStyle();
    }
}

