/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CavalinhoMagrelo;

/**
 *
 * @author claudio
 */
public class Caminhada {

    protected boolean achei = false;
    
    public void backTracking(int a[], int k, Casa[] taboleiro) {
        if (isSolution(a, k)) {
            ProcessSolution(a, k);
            achei = true;
        } else {
            k++;

            int c[] = construction(a, k, taboleiro);

            for (int i = 0; i < c.length; i++) {
                a[k] = c[i];
                backTracking(a, k, taboleiro);
                
                if(achei){
                    return;
                }
            }
        }
    }

    private boolean isSolution(int[] a, int k) {
        return ((k + 1) == a.length);
    }

    private void ProcessSolution(int[] a, int k) {
        for (int i = 0; i < (k+1); i++) {
            System.out.println(i+" (" + a[i] / 8 + " , " + a[i] % 8 + ") ");
        }
    }

    private int[] construction(int[] a, int k, Casa [] taboleiro) {
        int  tamanho = 0;
        int d[] = new int[8];
        for (int i = 0; i < 8; i++) {
            int f = Conversoes.moveXY(a[k], i);
            if (Conversoes.podeCriar(f) && !(taboleiro[f].isOcupada())) {
                d[tamanho++]=f;
                taboleiro[f].setOcupada(true);
            }
        }
        
        int c[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            c[i] = d[i];
        }
        
        return c;
    }
}

