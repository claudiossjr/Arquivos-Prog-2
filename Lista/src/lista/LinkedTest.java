/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import LinkedList_2.LinkedList_2;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import listaEncadeada.LinkedList;
import pilha_fila_Encadeada.LinkedEqueue;
import pilha_fila_Encadeada.LinkedStack;

/**
 *
 * @author tc claudio
 */
public class LinkedTest {

    public static void main(String[] args) {
//        LinkedStack ls = new LinkedStack();
//        for (int i = 0; i < 10; i++) {
//            ls.push(i);
//        }
//        System.out.println(ls.isEmpty());
//        System.out.println(ls.pop());
//        System.out.println(ls.top());
//        System.out.println("");
//        ls.printListNode();
//        ls.makeEmpty();
//        System.out.println(ls.isEmpty());
//
//        System.out.println("");
//        
//        LinkedEqueue ln = new LinkedEqueue();
//        for (int i = 0; i < 10; i++) {
//            ln.equeue(i);
//        }
//        System.out.println(ln.isEmpty());
//        System.out.println(ln.dequeue());
//        System.out.println(ln.getFront());
//        System.out.println("");
//        ln.printListNode();
//        ln.makeEmpty();
//        System.out.println(ln.isEmpty());

        LinkedList_2 ll = new LinkedList_2();
        for (int i = 0; i < 10; i++) {
            ll.insertAtFront(i);
        }
        System.out.println(ll.isEmpty());
        System.out.println(ll.getFront());
        System.out.println(ll.getBack());
        System.out.println("");
        ll.printList();
        System.out.println("");
        System.out.println("removeu na frente :"+ll.removeFromFront());
        System.out.println("removeu atras :"+ll.removeFromBack());
        System.out.println("");
        ll.printList();
        System.out.println("");
        ll.makeEmpty();
        ll.printList();
        System.out.println(ll.isEmpty());
    }
}
