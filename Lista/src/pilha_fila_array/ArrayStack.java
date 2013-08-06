/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila_array;

import pilha.IList;

/**
 *
 * @author lcc
 */
public class ArrayStack implements IList {

    private Object[] array;
    private int front;
    private int back;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        array = new Object[DEFAULT_CAPACITY];
        front = back = 0;
    }

    @Override
    public void push(Object x) {
        resize(back);
        array[back] = x;
        back++;
    }

    @Override
    public Object pop() {
        if (!(isEmpty())) {
            Object temp = array[back - 1];
            array[back -1] = null;
            back --;
            return temp;
        }
        return null;
    }

    @Override
    public Object top() {
        if(isEmpty()) return null;
        return array[back-1];
    }

    @Override
    public boolean isEmpty() {
        return (front==back);
    }

    @Override
    public void makeEmpty() {
        Object[] temp = new Object[DEFAULT_CAPACITY];
        this.array = temp;
        front=back=0;
    }

    public void resize(int pos) {
        if (pos > array.length - 1) {
            Object[] temp = new Object[array.length * 2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i];

            }
            array = temp;
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Sem Pilha");
        } else {
            for (int i = front; i < back; i++) {
                System.out.print("Elemento " + i + " : ");
                System.out.println(array[i]);
            }
        }
    }
}
