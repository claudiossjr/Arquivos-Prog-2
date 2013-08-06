/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author tc claudio
 */
public class BackTrackingSudoku {

    protected boolean achei = false;

    public void backTracking(int a[][], int k) {
        if (isSolution(a, k)) {
            processSolution(a, k);
            achei = true;
        } else {
            k++;

            if (a[k / 9][k % 9] == 0) {
            int c[] = candidatos(a, k);
            
            for (int i = 0; i < c.length; i++) {
                a[k / 9][k % 9] = c[i];
                backTracking(a, k);

                if (achei) {
                    return;
                } else{
                   a[k / 9][k % 9] = 0; 
                }
            }
            }else{
              backTracking(a,k);
            }
        }
    }

    private boolean isSolution(int a[][], int k) {
        return ((k + 1) == (a.length * a.length));
    }

    private void processSolution(int a[][], int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (j % 3 == 2 && j < a.length - 1) {
                    System.out.print(a[i][j] + "||");
                } else {
                    System.out.print(a[i][j] + "|");
                }
            }

            System.out.println();
        }
    }

    private int[] candidatos(int a[][], int k) {
        int tamanho = 0;
        int b[] = new int[9];
        for (int i = 1; i < 10; i++) {
            if (!estaLinha(a, k, i) && !estaColuna(a, k, i) && !estaQuadrado(a, k, i)) {
                b[tamanho] = i;
                tamanho++;
            }
        }
        int c[] = new int[tamanho];

        for (int i = 0; i < c.length; i++) {
            c[i] = b[i];
        }
        return c;
    }

    private boolean estaLinha(int a[][], int k, int valor) {
        for (int i = 0; i < a.length; i++) {
            if (a[k / 9][i] == valor) {
                return true;
            }
        }
        return false;
    }

    private boolean estaColuna(int a[][], int k, int valor) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][k % 9] == valor) {
                return true;
            }
        }
        return false;
    }

    private boolean estaQuadrado(int a[][], int k, int valor) {
        int linha = k / 9, coluna = k % 9;
        int linhaPQ = (linha / 3) * 3, colunaPQ = (coluna % 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[linhaPQ + i][colunaPQ + j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }
}
