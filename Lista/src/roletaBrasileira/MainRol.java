/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roletaBrasileira;

import fila.Fila;
import pilha_fila_array.ArrayQueue;

/**
 *
 * @author lcc
 */
public class MainRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayQueue fl = new ArrayQueue();
        for (int i = 1; i < Integer.parseInt(args[1]); i++) {
            fl.enqueue(i);
        }
        RoletaMarcos rm = new RoletaMarcos();
        System.out.println("vencedor: "+rm.constVencedor(Integer.parseInt(args[0]), fl));
    }
}
