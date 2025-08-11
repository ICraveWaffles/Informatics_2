package Targets;

import processing.core.PApplet;

public class Bullet {

    float x, y, vx, vy, r;
    boolean shot;
    int bounceCount;

    Bullet(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = 0;
        this.vy = 0;
        this.shot = false;
        this.bounceCount = 0;
    }


    void updatePos() {
        vy += 0.4f;
        vx += 0.03f;
        x += vx;
        y += vy;
    }

    void invertVx() {
        vx = -vx * 0.9f;
        bounceCount++;
    }

    void invertVy() {
        vy = -vy * 0.9f;
        bounceCount++;
    }



    void display(PApplet p5) {
        p5.pushStyle();
        p5.circle(x, y, r);
        p5.popStyle();
    }
}
