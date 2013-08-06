/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeprogii;

import Exercicios.BuscaBinaria;
import Exercicios.ExercicioI;
import Exercicios.ExercicioII;
import Exercicios.ExercicioIII;
import Exercicios.ExercicioIV;
import Exercicios.ExercicioIV;
import Exercicios.ExercicioV;
import Exercicios.ExercicioVI;

/**
 *
 * @author tc claudio
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*float a[] = {1f,2f,3f,4f,5f,25f,60f};
        System.out.println(ExercicioI.somaArray(a, a.length-1));
        
        System.out.println("");
        
        int b[] = {128,145,1,76,99,1000};
        System.out.println(ExercicioII.maiorArray(b, b[0], 1));
        
        System.out.println("");
        
        imprimi(b);
        System.out.println("");
        ExercicioIII.trocaArray(b, b.length-1, 0);
        imprimi(b);
        
        System.out.println("");
        */
        
        int c[] = {1,2,3,4,6,7,8};
        System.out.println(ExercicioIV.buscaTernaria(c,10,0,c.length-1));
        System.out.println("");
        
        //System.out.println(BuscaBinaria.buscaBinaria(c, 12, 0, c.length-1));
        
        
        
        //int c[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        //System.out.println(BuscaBinaria.buscaBinaria(c, 1,0,c.length-1));
        
        //ExercicioV.hanoiQuatro(5, 1, 2, 3, 4, 5);
        //ExercicioV.hanoiTres(3, 1, 2, 3);
        
        
        //int p[] = {1,5,4,6,7,9,78,43,100,66,12,1,999,18};
        //ExercicioVI.bubbleSortR(p, 0);   
        //imprimi(p);
    }

    private static void imprimi(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
            
        }
    }
}
