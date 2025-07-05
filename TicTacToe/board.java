package TicTacToe;

import processing.core.PApplet;

public class board {
    cas[][] cases;
    int size;
    int cellSize;

    public board(int size, int width) {
        this.size = size;
        this.cellSize = width / size;
        cases = new cas[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cases[i][j] = new cas(i, j, j*cellSize, i*cellSize, cellSize);
            }
        }
    }

    public int  getSize(){
        return this.size;
    }

    public void display(PApplet p5) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = j * cellSize;
                int y = i * cellSize;
                p5.stroke(255);
                p5.noFill();
                p5.rect(x, y, cellSize, cellSize);
                if (cases[i][j].value == cas.VALUE.X) {
                    p5.line(x + 10, y + 10, x + cellSize - 10, y + cellSize - 10);
                    p5.line(x + cellSize - 10, y + 10, x + 10, y + cellSize - 10);
                    p5.line(x + 10, y + 10, x + cellSize - 20, y + cellSize - 20);
                    p5.line(x + cellSize - 10, y + 10, x + 20, y + cellSize - 20);
                } else if (cases[i][j].value == cas.VALUE.O) {
                    p5.noFill();
                    p5.circle(x + cellSize / 2,y + cellSize / 2, cellSize - 20);
                    p5.circle(x + cellSize / 2,y + cellSize / 2, cellSize - 30);
                    p5.circle(x + cellSize / 2,y + cellSize / 2, cellSize - 40);
                }
            }
        }
    }

    public void boardClick(PApplet app, cas.VALUE value) {
        int col = app.mouseX / cellSize;
        int row = app.mouseY / cellSize;
        if (row >= 0 && row < size && col >= 0 && col < size) {
            if (cases[row][col].value == cas.VALUE.H) {
                cases[row][col].value = value;
            }
        }
    }

    public boolean checkAllCombinations(cas[][] b) {
        int n = b.length;

        for (int i = 0; i < n; i++) {
            boolean rowSame = true;
            for (int j = 0; j < n - 1; j++) {
                if (!b[i][j].value.equals(b[i][j + 1].value)) {
                    rowSame = false;
                    break;
                }
            }
            if (rowSame && !b[i][0].value.equals(cas.VALUE.H)) {
                return true;
            }
        }

        for (int i = 0; i < n; i++) {
            boolean colSame = true;
            for (int j = 0; j < n - 1; j++) {
                if (!b[j][i].value.equals(b[j + 1][i].value)) {
                    colSame = false;
                    break;
                }
            }
            if (colSame && !b[0][i].value.equals(cas.VALUE.H)) {
                return true;
            }
        }

        boolean mainDiagSame = true;
        for (int i = 0; i < n - 1; i++) {
            if (!b[i][i].value.equals(b[i + 1][i + 1].value)) {
                mainDiagSame = false;
                break;
            }
        }
        if (mainDiagSame && !b[0][0].value.equals(cas.VALUE.H)) {
            return true;
        }

        boolean antiDiagSame = true;
        for (int i = 0; i < n - 1; i++) {
            if (!b[i][n - 1 - i].value.equals(b[i + 1][n - 2 - i].value)) {
                antiDiagSame = false;
                break;
            }
        }
        if (antiDiagSame && !b[0][n - 1].value.equals(cas.VALUE.H)) {
            return true;
        }

        return false;
    }

}
