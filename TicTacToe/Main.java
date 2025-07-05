package TicTacToe;

import processing.core.PApplet;

public class Main extends PApplet {
    board b;
    boolean winner;
    cas.VALUE currentPlayer = cas.VALUE.O;
    int click_count = 0;

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        b = new board(4, width);
    }

    public void draw() {
        background(0);
        b.display(this);

        if (winner) {
            fill(255);
            textSize(64);
            textAlign(CENTER, CENTER);
            text("Winner!", width / 2, height / 2);
            exit();

        }
    }

    public void mousePressed() {
        click_count++;
        b.boardClick(this, currentPlayer);
        winner = b.checkAllCombinations(b.cases);
        println("Winner: " + winner);
        currentPlayer = (currentPlayer == cas.VALUE.O) ? cas.VALUE.X : cas.VALUE.O;

        if (click_count == (b.getSize()*b.getSize())){
            textSize(64);
            textAlign(CENTER, CENTER);
            text("Tie!", width / 2, height / 2);
            exit();
        }
    }

    public void keyPressed() {
    }

    public static void main(String[] args) {
        PApplet.main("TicTacToe.Main");
    }
}
