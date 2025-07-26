package ThePajitnovExperience;

import processing.core.PApplet;


public class TetrisMain extends PApplet {

    int clearedRows = 0;
    Color TetrisColors;
    GameBoard Gb;
    Shape currentShape;
    Shape heldShape = null;
    boolean canHold = true;

    float speed = 30;

    public void settings() {
        size(1000, 1080);

    }

    public static void main(String[] args) {
        PApplet.main("ThePajitnovExperience.TetrisMain");
    }

    public void setup() {

        Gb = new GameBoard(20, 10, 250, 10, 500, 1000);
        Gb.instanceCases();
        TetrisColors = new Color(this);
        currentShape = Shape.newRandomShape(this, Gb);
    }

    public void draw() {
        background(255);
        if (frameCount % speed == 0) {
            if (!currentShape.moveDown(Gb)) {
                Gb.placeShape(currentShape);
                currentShape = Shape.newRandomShape(this, Gb);
                canHold = true;
            } else {
                boolean[] full = Gb.checkFullRows();
                for (int i = 0; i < full.length; i++) {
                    if (full[i]) {
                        Gb.deleteRow(i);
                        clearedRows++;
                    }
                }
            }

        }


        displayGameBoard();

    }


    public void displayGameBoard(){
        pushMatrix();
        translate(Gb.x, Gb.y);
        Gb.display(this, TetrisColors.none);
        if (currentShape != null) {
            Gb.displayCases(this, TetrisColors.none, TetrisColors.colors);
            Gb.displayShape(this, currentShape, TetrisColors.colors);
        }

        popMatrix();

        fill(127); textAlign(LEFT); textSize(20);
        text("Cleared Rows:" + clearedRows, 25, 25);
        text("Hold Piece:" + (heldShape != null ? heldShape.shapeType : " No one yet"), 25, 50);
    }



    public void keyPressed() {
        if (currentShape == null) return;

        switch (keyCode) {
            case LEFT -> currentShape.moveLeft(Gb);
            case RIGHT -> currentShape.moveRight(Gb);
            case DOWN -> currentShape.moveDown(Gb);
            case UP -> currentShape.moveHardDown(Gb);
        }

        if (key == 'a' || key == 'A') currentShape.setRotation(-1, Gb);
        if (key == 'd' || key == 'D') currentShape.setRotation(1, Gb);
        if (key == 'w' || key == 'W') holdPiece();
    }

    public void holdPiece() {
        if (!canHold || currentShape == null) return;

        Shape temp = heldShape;
        heldShape = currentShape;
        heldShape.setPosition(0, Gb.nCol / 2 - 1);

        if (temp == null) {
            currentShape = Shape.newRandomShape(this, Gb);
        } else {
            currentShape = temp;
            currentShape.setPosition(0, Gb.nCol / 2 - 1);
        }

        canHold = false;
    }



}