package TicTacToe;


import processing.core.PApplet;

public class cas {
    public enum VALUE {O, X, H}
    VALUE value;
    float  row, col, x, y, w;


    public cas(int row, float col, float x, float y, float w){
        this.value = VALUE.H;
        this.row = row;
        this.col = col;
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public void setValue(VALUE value){
        this.value = value;
    }

    public boolean isInside(float px, float py) {
        return px >= x && px <= x + w && py >= y && py <= y + w;
    }






}
