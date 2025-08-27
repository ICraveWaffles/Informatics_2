package Minesweeper;

import processing.core.PApplet;

public class cas {
    int row, col, nMines;
    boolean isBomb, checked, flagged;

    cas(int row, int col, boolean b) {
        this.row = row;
        this.col = col;
        this.nMines = 0;
        this.isBomb = b;
        this.checked = false;
        this.flagged = false;
    }

    void setBomb(boolean b) {
        this.isBomb = b;
    }

    void setnMines(int n) {
        this.nMines = n;
    }

    void discover(boolean b) {
        this.checked = b;
    }

    void flag() {
        this.flagged = !this.flagged;
    }


    void setNumberColor(PApplet p5) {
        switch (this.nMines) {
            case 1: p5.fill(0, 0, 255); break;
            case 2: p5.fill(63, 255, 63); break;
            case 3: p5.fill(255, 0, 0); break;
            case 4: p5.fill(0, 0, 127); break;
            case 5: p5.fill(127, 0, 0); break;
            case 6: p5.fill(0, 127, 127); break;
            case 7: p5.fill(0); break;
            case 8: p5.fill(127); break;
            default: p5.fill(255); break;
        }
    }

    void display(PApplet p5, float caseX, float caseY, float w, float h, boolean end) {
        p5.strokeWeight(3);

        if (end) {
            p5.fill(255);
            p5.rect(caseX, caseY, w, h, 10);
            if (this.isBomb) {
                p5.fill(0);
                p5.circle(caseX + 0.5f * w, caseY + 0.5f * h, w * 0.5f);
                p5.line(caseX + 0.1f * w, caseY + 0.1f * h, caseX + 0.9f * w, caseY + 0.9f * h);
                p5.line(caseX + 0.9f * w, caseY + 0.1f * h, caseX + 0.1f * w, caseY + 0.9f * h);
                p5.line(caseX + 0.5f * w, caseY + 0.1f * h, caseX + 0.5f * w, caseY + 0.9f * h);
                p5.line(caseX + 0.1f * w, caseY + 0.5f * h, caseX + 0.9f * w, caseY + 0.5f * h);
            } else if (this.nMines != 0) {
                p5.textSize(36);
                p5.textAlign(p5.CENTER, p5.CENTER);
                setNumberColor(p5);
                p5.text(this.nMines, caseX + 0.5f * w, caseY + 0.5f * h);
            }
        } else {
            if (this.checked) {
                p5.fill(255);
                p5.rect(caseX, caseY, w, h);
                if (this.nMines != 0) {
                    p5.textSize(36);
                    p5.textAlign(p5.CENTER, p5.CENTER);
                    setNumberColor(p5);
                    p5.text(this.nMines, caseX + 0.5f * w, caseY + 0.5f * h);
                }
            } else if (this.flagged) {
                p5.fill(200, 0, 0);
                p5.rect(caseX, caseY, w, h, 10);
            } else {
                p5.fill(150);
                p5.rect(caseX, caseY, w, h, 10);
            }
        }
    }
}
