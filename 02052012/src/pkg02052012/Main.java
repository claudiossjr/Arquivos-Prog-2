/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02052012;

/**
 *
 * @author tc claudio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] auma = {0,10,9,40,50};
        Ordena.quickSort(auma, 0, auma.length);
        for (int i = 0; i < auma.length; i++) {
            System.out.println(auma[i]);
        System.out.println("");
            
        }
    }
}
