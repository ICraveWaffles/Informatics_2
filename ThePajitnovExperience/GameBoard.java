package ThePajitnovExperience;

import processing.core.PApplet;

public class GameBoard {
    Shape[] shapes;
    int maxShapes = 1000;
    int nShapes;
    int x, y, nRow, nCol;
    float caseWidth, caseHeight;
    Shape.SHAPE_TYPE[][] cases;

    GameBoard(int nRow, int nCol, int x, int y, float width, float height) {
        this.nRow = nRow;
        this.nCol = nCol;
        this.x = x;
        this.y = y;
        this.caseWidth = width / nCol;
        this.caseHeight = height / nRow;

        shapes = new Shape[maxShapes];

        nShapes = 0;
    }

    void instanceCases() {
        cases = new Shape.SHAPE_TYPE[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                cases[i][j] = Shape.SHAPE_TYPE.MT;
            }
        }
    }

    void display(PApplet p5, int colorMT) {
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                p5.fill(colorMT);
                p5.stroke(0);
                p5.rect(j * caseWidth, i * caseHeight, caseWidth, caseHeight);
            }
        }
    }

    void displayShape(PApplet p5, Shape sh, int[] colors) {
        boolean[][] currentMatrix = sh.matrix[sh.rotation];
        for (int i = 0; i < currentMatrix.length; i++) {
            for (int j = 0; j < currentMatrix[0].length; j++) {
                if (currentMatrix[i][j]) {
                    int r = sh.row + i;
                    int c = sh.col + j;
                    p5.fill(colors[sh.shapeType.ordinal()]);
                    if (sh.shapeType == Shape.SHAPE_TYPE.O1 ){
                        p5.stroke(255);
                    } else {
                    p5.stroke(0);
                    }
                    p5.strokeWeight(4);
                    p5.rect(c * caseWidth, r * caseHeight, caseWidth, caseHeight);
                    p5.line(c * caseWidth+10, r * caseHeight+10, (c+1)*caseWidth-10, (r+1)*caseHeight-10);
                    p5.line((c+1) * caseWidth-10, r * caseHeight+10, c*caseWidth+10, (r+1)*caseHeight-10);




                }

            }
        }
    }

    void displayCases(PApplet p5, int colorMT, int[] colors){
        for (int i = 0; i<nCol;i++){
            for (int j = 0; j<nRow;j++){
                p5.fill(colorMT);
                if (cases[j][i] != Shape.SHAPE_TYPE.MT){
                    int nColor = cases[j][i].ordinal();
                    p5.fill(colors[nColor]);
                }
                p5.stroke(0);
                p5.rect(i*caseWidth, j*caseHeight, caseWidth,caseHeight);
                p5.tint(255,127);

                if (cases[j][i]== Shape.SHAPE_TYPE.O1){
                    p5.stroke(255);
                }
                if (cases[j][i] != Shape.SHAPE_TYPE.MT){
                    p5.line(i * caseWidth+10, j * caseHeight+10, (i+1)*caseWidth-10, (j+1)*caseHeight-10);
                    p5.line((i+1) * caseWidth-10, j * caseHeight+10, i*caseWidth+10, (j+1)*caseHeight-10);
                }




            }
        }
    }

    void placeShape(Shape sh) {
        if (nShapes < maxShapes){
            shapes[nShapes] = sh;
            nShapes++;
        }
        boolean[][] currentMatrix = sh.matrix[sh.rotation];
        for (int i = 0; i < currentMatrix.length; i++) {
            for (int j = 0; j < currentMatrix[0].length; j++) {
                if (currentMatrix[i][j]) {
                    int row = i + sh.row;
                    int col = j + sh.col;
                    if (row >= 0 && row < nRow && col >= 0 && col < nCol) {
                        cases[row][col] = sh.shapeType;
                    }
                }
            }
        }
    }



    boolean checkRows (int nRows){
        for (int i = 0; i < cases[nRows].length;i++){
            if (cases[nRows][i]==Shape.SHAPE_TYPE.MT){
                return false;
            }
        }
        return true;
    }

    boolean[] checkFullRows(){
        boolean[] full = new boolean[cases.length];
        for (int i = cases.length-1;i>=0;i--){
            full[i] = checkRows(i);
        }
        return full;
    }

    void deleteRow(int row){

        for (int i = row; i >1;i--){
            for (int j = 0; j < cases[i].length;j++){
                cases[i][j] = cases[i-1][j];
            }
        }

        for (int i = 0; i < cases[0].length;i++) {
            cases[0][i] = Shape.SHAPE_TYPE.MT;
        }
    }

}