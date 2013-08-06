/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import listasArray.ArrayList;

/**
 *
 * @author lcc
 */
public class Fila implements IList {

    ArrayList lista;

    public Fila() {
        lista = new ArrayList();
    }

    @Override
    public void enqueue(Object x) {
        lista.insertAtBack(x);
    }

    @Override
    public Object getFront() {
        return lista.get(0);
    }

    @Override
    public Object getBack() { 
        return lista.get(lista.size() - 1);
    }

    @Override
    public Object dequeue() {
        return lista.removeFromFront();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public void makeEmpty() {
        lista.makeEmpty();
    }
}
