/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author tc claudio
 */
public class BuscaBinaria {

    public static boolean buscaBinaria(int a[], int n, int inicio, int fim) {
        if (inicio > fim) {
            return false;
        } else {
            int meio = (fim - inicio) / 2 + inicio;

            if (a[meio] == n) {
                return true;
            } else {
                if (n < a[meio]) {
                    return buscaBinaria(a, n, inicio, meio - 1);
                } else {
                    if (n > a[meio]) {
                    return buscaBinaria(a, n, meio + 1, fim);
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean buscaBinariaI(int a[], int n){
        int inicio = 0, fim = a.length-1;
        int meio;
        
        while(inicio <= fim){
            meio = (fim+inicio)/2;
            if (a[meio] == n){
                return true;
            }else{
                if(n < a[meio]){
                    fim = meio -1; 
                }else{
                    if(n > a[meio]){
                        inicio = meio+1;
                    }
                }
            }
        }
        return false;
    }
}
