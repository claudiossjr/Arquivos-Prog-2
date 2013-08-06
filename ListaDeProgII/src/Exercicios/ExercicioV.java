/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author claudio
 */
public class ExercicioV {
    public static void hanoiQuatro(int n, int inicio, int aux1, int aux2,int aux3, int destino){
        if(n == 1){
            move(inicio,destino,n);
        }else{
            hanoiQuatro(n-1,inicio,aux2,aux3,destino,aux1);
            move(inicio,destino,n);
            hanoiQuatro(n-1,aux1,aux2,aux3,inicio,destino);
        }
    }

    private static void move(int inicio, int destino,int n) {
        System.out.println("peca "+ n + " = " + inicio + " " + destino);
    }
    
    public static void hanoiTres(int n, int inicio, int aux, int destino){
        if(n == 1){
            move(inicio, destino,n);
        }else{
            hanoiTres(n-1, inicio, destino, aux);
            move(inicio,destino,n);
            hanoiTres(n-1, aux, inicio, destino);
        }
    }
}
