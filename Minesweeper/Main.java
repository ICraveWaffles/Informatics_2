package Minesweeper;

import processing.core.PApplet;

public class Main extends PApplet{

    board gb;

    public void settings(){

        fullScreen();
    }

    public void setup(){
        gb = new board(16, 16, 40, 40, 40);
        gb.instanceCases();
        gb.setMines(this);
        gb.setnMines();
        gb.end(false);
    }

    public void draw(){
        if (gb.end) {
            if (gb.nRemainingMines == 0) {
                background(0, 255, 0);
            }
            else {
                background(255,0,0);
            }
        } else {
            background(225);
        }

        gb.display(this);

        if (gb.nRemainingMines == 0) {
            gb.end = true;
        }



    }

    public static void main(String[] args){
        PApplet.main("Minesweeper.Main");
    }

    public void mousePressed() {
        int[] indexes = gb.clickedCases(mouseX, mouseY);
        int row = indexes[0];
        int col = indexes[1];

        if (row >= 0 && row < gb.xcas && col >= 0 && col < gb.ycas) {
            cas cell = gb.gameboard[row][col];

            if (mouseButton == LEFT) {
                if (!cell.flagged) {
                    if (cell.isBomb) {
                        gb.end(true);
                    } else {
                        gb.uncover(row, col);
                    }
                }
            } else if (mouseButton == RIGHT) {
                if (!cell.checked) {
                    cell.flag();
                    if (cell.flagged && cell.isBomb) {
                        gb.nRemainingMines--;
                    } else if (!cell.flagged && cell.isBomb){
                        gb.nRemainingMines++;
                    }
                }
            }
        }
    }

}
