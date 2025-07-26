package ThePajitnovExperience;

import processing.core.PApplet;

public class Shape {
    public enum SHAPE_TYPE {MT, O1, I2, I3, V3, O4, Z4, S4, T4, L4, J4, I4}

    SHAPE_TYPE shapeType;
    boolean[][][] matrix;
    int rotation;
    int row, col;

    public Shape(boolean[][][] matrix, SHAPE_TYPE shapeType) {
        this.matrix = matrix;
        this.shapeType = shapeType;
        this.rotation = 0;
    }

    public boolean freeSpace(GameBoard Gb, int row, int col) {
        boolean[][] rotMatrix = matrix[rotation];
        for (int i = 0; i < rotMatrix.length; i++) {
            for (int j = 0; j < rotMatrix[0].length; j++) {
                if (rotMatrix[i][j]) {
                    int r = row + i;
                    int c = col + j;
                    if (r < 0 || r >= Gb.nRow || c < 0 || c >= Gb.nCol || Gb.cases[r][c] != SHAPE_TYPE.MT) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setRotation(int change, GameBoard Gb) {
        int nRotations = matrix.length;
        int newRotation = (rotation + change) % nRotations;
        if (newRotation < 0){
            newRotation += nRotations;
        }
        tryRotationWithWallKick(newRotation, Gb);
    }

    private void tryRotationWithWallKick(int newRotation, GameBoard Gb) {
        int[] offsets = {0, -1, 1, -2, 2};
        for (int offset : offsets) {
            int newCol = col + offset;
            if (canPlaceAt(newRotation, row, newCol, Gb)) {
                this.rotation = newRotation;
                this.col = newCol;
                return;
            }
        }
    }

    private boolean canPlaceAt(int testRotation, int testRow, int testCol, GameBoard Gb) {
        boolean[][] testMatrix = matrix[testRotation];
        for (int i = 0; i < testMatrix.length; i++) {
            for (int j = 0; j < testMatrix[0].length; j++) {
                if (testMatrix[i][j]) {
                    int r = testRow + i;
                    int c = testCol + j;
                    if (r < 0 || r >= Gb.nRow || c < 0 || c >= Gb.nCol || Gb.cases[r][c] != SHAPE_TYPE.MT) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void moveLeft(GameBoard Gb) {
        if (freeSpace(Gb, row, col - 1)) col--;
    }

    public void moveRight(GameBoard Gb) {
        if (freeSpace(Gb, row, col + 1)) col++;
    }

    public boolean moveDown(GameBoard Gb) {
        if (freeSpace(Gb, row + 1, col)) {
            row++;
            return true;
        }
        return false;
    }

    public void moveHardDown(GameBoard Gb) {
        while (moveDown(Gb));
    }

    public static Shape newBlock(PApplet p5, SHAPE_TYPE shapeType, GameBoard Gb) {
        Shape sh;
        switch (shapeType) {
            case O1: sh = new O1(); break;
            case I2: sh = new I2(); break;
            case I3: sh = new I3(); break;
            case V3: sh = new V3(); break;
            case O4: sh = new O4(); break;
            case Z4: sh = new Z4(); break;
            case S4: sh = new S4(); break;
            case T4: sh = new T4(); break;
            case L4: sh = new L4(); break;
            case J4: sh = new J4(); break;
            case I4: sh = new I4(); break;
            default: sh = new O1(); break;
        }
        sh.setPosition(0, Gb.nCol / 2 - 1);
        return sh;
    }



    public static Shape newRandomShape(PApplet p5, GameBoard Gb) {
        int n = (int) p5.random(1, SHAPE_TYPE.values().length);
        Shape newSh = newBlock(p5, SHAPE_TYPE.values()[n], Gb);
        if (!newSh.freeSpace(Gb, newSh.row, newSh.col)) return null;
        return newSh;
    }

    public static class O1 extends Shape {
        public O1() { super(Matrixes.o1, SHAPE_TYPE.O1); }
    }

    public static class I2 extends Shape {
        public I2() { super(Matrixes.i2, SHAPE_TYPE.I2); }
    }

    public static class I3 extends Shape {
        public I3() { super(Matrixes.i3, SHAPE_TYPE.I3); }
    }

    public static class V3 extends Shape {
        public V3() { super(Matrixes.v3, SHAPE_TYPE.V3); }
    }
    public static class Z4 extends Shape {
        public Z4() { super(Matrixes.z4, SHAPE_TYPE.Z4); }
    }

    public static class S4 extends Shape {
        public S4() { super(Matrixes.s4, SHAPE_TYPE.S4); }
    }

    public static class T4 extends Shape {
        public T4() { super(Matrixes.t4, SHAPE_TYPE.T4); }
    }

    public static class L4 extends Shape {
        public L4() { super(Matrixes.l4, SHAPE_TYPE.L4); }
    }

    public static class J4 extends Shape {
        public J4() { super(Matrixes.j4, SHAPE_TYPE.J4); }
    }

    public static class I4 extends Shape {
        public I4() { super(Matrixes.i4, SHAPE_TYPE.I4); }
    }

    public static class O4 extends Shape {
        public O4() { super(Matrixes.o4, SHAPE_TYPE.O4); }
    }
}


