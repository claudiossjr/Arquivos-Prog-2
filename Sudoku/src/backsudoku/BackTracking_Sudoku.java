/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backsudoku;

/**
 *
 * @author lcc
 */
public class BackTracking_Sudoku {

    protected boolean achei;

    public void backTracking_Sudoku(int a[], int k) {
        if (isSolution(a, k)) {
            processSolution(a, k);
            achei = true;
        } else {
            k++;

            int c[] = construction(a, k);

            for (int i = 0; i < c.length; i++) {
                a[k] = c[i];
                backTracking_Sudoku(a, k);

                if (achei) {
                    return;
                }
            }
        }
    }

    private boolean isSolution(int a[], int k) {
        return ((k + 1) == a.length);
    }

    private void processSolution(int a[], int k) {
        for (int i = 0; i < (k + 1); i++) {

            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(a[i] + " ");

        }
    }

    private int[] construction(int a[], int k) {
        int tamanho = 0;
        int d[] = new int [9];
        for (int i = 1; i < 10; i++) {
            if(!isLinha(a,k,i) && !isColuna(a,k,i) && !isQuadrado(a,k,i)){
                d[tamanho++] = i;
            }
        }

        int c[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            c[i] = d[i];
        }
        
        return c;
    }

    private boolean isLinha(int a[], int l, int valor) {
        int linha = (l / 8);
        for (int j = 0; j < 9; j++) {
            int k = linha * 8 + j;
            if (a[k] == valor) {
                return true;
            }
        }
        return false;
    }

    private boolean isColuna(int a[], int l, int valor) {
        int coluna = (l % 8) ;

        for (int i = 0; i < 9; i++) {
            int k = i * 8 + coluna;
            if (a[k] == valor) {
                return true;
            }
        }
        return false;
    }

    private boolean isQuadrado(int a[], int l, int valor) {
        int linha = l / 8, coluna = l % 8;
        int linhaInicial = (linha / 3) * 3, colunaInicial = (coluna / 3) * 3;
        int h = linhaInicial * 8 + colunaInicial;
        if (a[h] == valor) {
            return true;
        } else {
            for (int i = 0; i < 8; i++) {
                 int q = moveXY(h,i);
                 if(a[q] == valor){
                     return true;
                 }
            }
        }
        return false;
    }

    private int moveXY(int l, int ind) {
        switch (ind) {
            case 0:
                int linha = ((l / 8) + 1),
                 coluna = l % 8;
                return linha * 8 + coluna;
            case 1:
                int linha1 = ((l / 8) + 2),
                 coluna1 = l % 8;
                return linha1 * 8 + coluna1;
            case 2:
                int linha2 = ((l / 8)),
                 coluna2 = ((l % 8) + 1);
                return linha2 * 8 + coluna2;
            case 3:
                int linha3 = ((l / 8)),
                 coluna3 = ((l % 8) + 2);
                return linha3 * 8 + coluna3;
            case 4:
                int linha4 = ((l / 8) + 1),
                 coluna4 = ((l % 8) + 1);
                return linha4 * 8 + coluna4;
            case 5:
                int linha5 = ((l / 8) + 2),
                 coluna5 = ((l % 8) + 2);
                return linha5 * 8 + coluna5;
            case 6:
                int linha6 = ((l / 8) + 1),
                 coluna6 = ((l % 8) + 2);
                return linha6 * 8 + coluna6;
            case 7:
                int linha7 = ((l / 8) + 2),
                 coluna7 = ((l % 8) + 1);
                return linha7 * 8 + coluna7;

        }

        return 0;
    }
}
