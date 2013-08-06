/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author tc claudio
 */
public class ExercicioVI {

    public static void bubbleSortR(int a[], int i) {
       if (i > a.length-1){
           return;
       }else{
           for (int j = 0; j < a.length; j++) {
               if(a[i] < a[j]){
                   int aux = a[i];
                   a[i] = a[j];
                   a[j] = aux;
               }
           }
           bubbleSortR(a,i+1);
       }
    }
}
