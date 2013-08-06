/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anali.String;

import pilha.Pilha;

/**
 *
 * @author lcc
 */
public class Anali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pl = new Pilha();
        if (Analise.analiPilha(args[0], pl)) {
            System.out.println("esta correto");
        } else {
            System.out.println("erro...!");
        }
    }
}
