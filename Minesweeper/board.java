package Minesweeper;

import processing.core.PApplet;
import static processing.core.PApplet.floor;

public class board {
    float x, y, w, h;
    int xcas, ycas, nMines, nRemainingMines;
    boolean end;
    cas[][] gameboard;

    board(int xcas, int ycas, float w, float h, int nMines){
        this.x = 0; this.y = 0;
        this.w = w; this.h = h;
        this.xcas = xcas; this.ycas = ycas;
        this.nMines = nMines;
        this.nRemainingMines = nMines;
        this.end = false;
    }

    void instanceCases(){
        this.gameboard = new cas[this.xcas][this.ycas];
        for (int i = 0; i < this.xcas; i++){
            for (int j = 0; j < this.ycas; j++){
                this.gameboard[i][j] = new cas(i, j, false);
            }
        }
    }

    void setnMines() {
        for (int i = 0; i < this.xcas; i++) {
            for (int j = 0; j < this.ycas; j++) {
                if (!this.gameboard[i][j].isBomb) {
                    int n = 0;
                    for (int dx = -1; dx <= 1; dx++) {
                        for (int dy = -1; dy <= 1; dy++) {
                            if (dx == 0 && dy == 0) continue;
                            int nx = i + dx;
                            int ny = j + dy;
                            if (nx >= 0 && nx < this.xcas && ny >= 0 && ny < this.ycas) {
                                if (this.gameboard[nx][ny].isBomb) {
                                    n++;
                                }
                            }
                        }
                    }
                    this.gameboard[i][j].setnMines(n);
                }
            }
        }
    }

    void end(boolean b){
        this.end = b;
    }

    void setMines(PApplet p5){
        int n = 0;
        do {
            int randomrow = floor(p5.random(0, this.xcas));
            int randomcol = floor(p5.random(0, this.ycas));
            if(!this.gameboard[randomrow][randomcol].isBomb){
                this.gameboard[randomrow][randomcol].setBomb(true);
                n++;
            }
        } while (n < this.nMines);
    }

    int[] clickedCases(float mx, float my){
        int row = floor((my - this.y) / this.h);
        int col = floor((mx - this.x) / this.w);
        return new int[]{row, col};
    }


    //La deixona ara descobreix una "capa" més perquè sigui més fluit
    void uncover(int row, int col){
        if (row < 0 || row >= this.xcas || col < 0 || col >= this.ycas) return;
        cas c = this.gameboard[row][col];
        if (c.checked || c.isBomb) return;
        c.discover(true);
        if (c.nMines != 0) return;
        for (int dr = -1; dr <= 1; dr++){
            for (int dc = -1; dc <= 1; dc++){
                if (dr == 0 && dc == 0) continue;
                int nr = row + dr;
                int nc = col + dc;
                if (nr < 0 || nr >= this.xcas || nc < 0 || nc >= this.ycas) continue;
                cas nb = this.gameboard[nr][nc];
                if (nb.checked || nb.isBomb) continue;
                if (nb.nMines == 0) {
                    uncover(nr, nc);
                } else {
                    nb.discover(true);
                }
            }
        }
    }




    void display(PApplet p5){
        for (int i = 0; i < this.xcas; i++){
            for (int j = 0; j < this.ycas; j++){
                float xc = this.x + this.w * j;
                float yc = this.y + this.h * i;
                this.gameboard[i][j].display(p5, xc, yc, this.w, this.h, this.end);
            }
        }
    }


}
