/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import listasArray.ArrayList;

/**
 *
 * @author lcc
 */
public class Pilha implements IList {

    ArrayList lista;

    public Pilha() {
        lista = new ArrayList(); // inicializou o objeto
    }

    @Override
    public void push(Object x) {
        lista.insertAtBack(x);
    }

    @Override
    public Object pop() {
        return lista.removeFromBack();
    }

    @Override
    public Object top() {
        return lista.get(lista.size() - 1);
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
