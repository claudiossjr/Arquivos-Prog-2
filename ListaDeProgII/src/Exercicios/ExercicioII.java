/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author tc claudio
 */
public class ExercicioII {
    protected static int maior1;
    public static int maiorArray(int a[], int maior, int i){
        if(i >= a.length){
            maior1 = maior;
        }else{
            if(a[i] > maior){
            maior1 = maiorArray(a,a[i],++i);
            }else{
           maior1 = maiorArray(a,maior,++i);
            }
        } 
        return maior1;
    }
}
