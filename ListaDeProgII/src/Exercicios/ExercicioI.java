/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author claudio santos
 */
public class ExercicioI {
    
    public static float somaArray(float a[], int k){
        float soma;
        if(k <= 0){
            return a[0];
        }else{
            soma = a[k] + somaArray(a,k-1);
        }
        return soma;
    } 
}
