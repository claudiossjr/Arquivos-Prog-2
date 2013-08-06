/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author lcc
 */
public interface IList {
    void enqueue(Object x); // enfileira
    Object getFront();
    Object getBack();
    Object dequeue(); // desenfileira
    boolean isEmpty();
    void makeEmpty();
}
