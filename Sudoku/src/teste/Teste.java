package teste;

import backsudoku.BackTracking_Sudoku;

public class Teste {

    public static void main(String[] args) {
        BackTracking_Sudoku bs = new BackTracking_Sudoku();
        int a[] = construirA();
        bs.backTracking_Sudoku(new int[81], -1);
    }

    private static int[] construirA() {
        int c[] = new int[81];

        int d[][] = {
                {0, 0, 3, 9, 7, 0, 0, 0, 8},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {7, 1, 0, 4, 0, 0, 0, 3, 2},
                {0, 0, 9, 0, 1, 0, 7, 0, 0},
                {0, 0, 5, 0, 0, 0, 2, 0, 0},
                {0, 0, 4, 0, 8, 0, 6, 0, 0},
                {6, 2, 0, 0, 0, 5, 0, 1, 4},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {3, 0, 0, 0, 6, 4, 8, 0, 0}};
    
        for (int t = 0; t < c.length; t++) {
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[0].length; j++) {
                    c[t] = d[i][j];
                }
            }
        }

        return c;
    }
}
