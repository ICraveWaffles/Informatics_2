package Targets;

import processing.core.PApplet;

public class TargetsMain extends PApplet {

    Target[] targets;
    Bullet[] bullets = new Bullet[3];
    int currentBullet = 0;
    int numShots = 0, numPoints = 0, numTargets = 0;
    float t = 0;
    boolean resetPrompt = false;

    public static void main(String[] args) {
        PApplet.main("Targets.TargetsMain");
    }

    public void settings() {
        size(1000, 500);
    }

    public void setup() {
        background(255);
        setTargets(6, 10);
        bullets[0] = new Bullet(10, 250, 20);
        bullets[1] = new Bullet(10, 250, 15);
        bullets[2] = new Bullet(10, 250, 10);
    }

    public void draw() {
        background(255);
        displayInfo();

        for (int i = 0; i < targets.length; i++) {
            Target t = targets[i];
            t.display(this);

            for (Bullet b : bullets) {
                if (t.hasBeenShotDown(this, b) && t.state != Target.STATE.OFF) {
                    t.changeState(Target.STATE.OFF);
                    numPoints++;
                }
            }

            if (t.state == Target.STATE.OFF) {
                t.updatePos();
            }
        }

        for (Bullet b : bullets) {
            if (b.shot) {
                b.updatePos();

                if (b.bounceCount < 2) {
                    if (b.x < 0) {
                        b.x = 0;
                        b.invertVx();
                    } else if (b.x > width) {
                        b.x = width;
                        b.invertVx();
                    }

                    if (b.y < 0) {
                        b.y = 0;
                        b.invertVy();
                    } else if (b.y > height) {
                        b.y = height;
                        b.invertVy();
                    }
                }
            }
            b.display(this);
        }


        boolean allOut = true;
        for (Bullet b : bullets) {
            if (b.shot && b.x <= width && b.y <= height) {
                allOut = false;
                break;
            }
        }

        if (allOut && currentBullet == bullets.length) {
            for (int i = 0; i < targets.length; i++) {
                if (targets[i].state == Target.STATE.PENDING) {
                    targets[i].changeState(Target.STATE.ON);
                }
            }
            resetPrompt = true;
        }


        if (resetPrompt) {
            textAlign(CENTER);
            textSize(36);
            fill(255, 0, 0);
            text("Press R key to set up the next scenario", width / 2, height / 2);
        }
    }

    public void mousePressed() {
        if (currentBullet < bullets.length) {
            Bullet b = bullets[currentBullet];
            if (!b.shot) {
                float speedFactor = 20f / b.r;
                b.vx = (mouseX - b.x) / (30f / speedFactor);
                b.vy = (mouseY - b.y) / (30f / speedFactor);
                b.shot = true;
                numShots++;
                currentBullet++;
            }
        }
    }

    public void keyPressed() {
        if (keyCode == UP) {
            for (Bullet b : bullets) {
                if (!b.shot) b.y -= 10;
            }
        }
        if (keyCode == DOWN) {
            for (Bullet b : bullets) {
                if (!b.shot) b.y += 10;
            }
        }
        if (key == 'r' || key == 'R') {
            setTargets(6, 10);
            bullets[0] = new Bullet(10, 250, 20);
            bullets[1] = new Bullet(10, 250, 15);
            bullets[2] = new Bullet(10, 250, 10);
            currentBullet = 0;
            t = 0;
            numShots = 0;
            numPoints = 0;
            resetPrompt = false;
        }
    }

    void setTargets(int n1, int n2) {
        int nt = (int) random(n1, n2);
        targets = new Target[nt];
        numTargets = nt;
        for (int i = 0; i < nt; i++) {
            float x = random(width / 8f, width / 1.1f);
            float y = random(height / 5, 4 * height / 5);
            float r = random(15, 50);
            targets[i] = new Target(x, y, r);
        }
    }

    void displayInfo() {
        fill(0);
        textAlign(LEFT);
        textSize(34);
        fill(0);
        textAlign(RIGHT);
        text("Score", width - 50, 50);
        textSize(14);
        String percentatge = (numTargets == 0) ? "0.00" : nf(100 * (numPoints / (float) numTargets), 2, 2);
        text("Rate: " + percentatge + "%", width - 50, 80);
        text("Hits: " + numPoints + " / " + numTargets, width - 50, 100);
        text("Shots: " + numShots, width - 50, 120);
        fill(0);
        textSize(14);
        textAlign(LEFT);
        text("You get three bullets per round,", 50, height - 130);
        text("each smaller but faster than the previous one", 50, height - 110);
        text("Click in any direction to shot your cannon.", 50, height - 90);
        text("The furthest you click, the faster it goes.", 50, height-70);
        text("Press UP and DOWN to move your cannon", 50, height - 50);

    }
}
