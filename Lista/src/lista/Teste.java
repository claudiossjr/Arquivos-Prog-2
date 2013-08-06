/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import fila.Fila;
import pilha.Pilha;
import pilha_fila_array.ArrayQueue;
import pilha_fila_array.ArrayStack;

/**
 *
 * @author lcc
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pilha pilha = new Pilha();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        System.out.println(pilha.isEmpty());
        pilha.makeEmpty();
        System.out.println(pilha.isEmpty());
        
        System.out.println("");
        
        
        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        System.out.println(fila.dequeue());
        System.out.println(fila.isEmpty());
        System.out.println(fila.getFront());
        System.out.println(fila.getBack());
        fila.makeEmpty();
        System.out.println(fila.isEmpty());
         * 
         */
        
//        ArrayQueue aq = new ArrayQueue();
//        aq.enqueue(1);
//        aq.enqueue(2);
//        aq.enqueue(3);
//        aq.enqueue(4);
//        aq.enqueue(5);
//        aq.print();
//        System.out.println(aq.isEmpty());
//        System.out.println(aq.dequeue());
//        aq.print();
//        System.out.println(aq.isEmpty());
//        System.out.println(aq.getFront());
//        System.out.println(aq.getBack());
//        aq.makeEmpty();
//        System.out.println(aq.isEmpty());
//        aq.print();
        
        ArrayStack as = new ArrayStack();
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.print();
        System.out.println(as.isEmpty());
        System.out.println(as.pop());
        as.print();
        System.out.println(as.isEmpty());
        System.out.println(as.top());
        as.makeEmpty();
        System.out.println(as.isEmpty());
        as.print();
    }
}
