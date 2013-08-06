/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author tc claudio
 */
public class ExercicioIII {
    
    public static void trocaArray(int a[],int maior,int menor){
        if(maior <= menor){
            return;
        }else{
            int aux = a[maior];
            a[maior] = a[menor];
            a[menor] = aux;
            trocaArray(a,--maior, ++ menor);
        }
    }
}
