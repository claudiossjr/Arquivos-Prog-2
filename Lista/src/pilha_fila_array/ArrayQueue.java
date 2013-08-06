/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila_array;

import fila.IList;

/**
 *
 * @author lcc
 */
public class ArrayQueue implements IList {

    private Object[] array;
    private int front;
    private int back;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayQueue() {
        array = new Object[DEFAULT_CAPACITY];
        front = back = 0;
    }

    @Override
    public void enqueue(Object x) {
        resize(back);
        array[back] = x;
        back++;
    }

    @Override
    public Object getFront() {
        return array[front];
    }

    @Override
    public Object getBack() {
        return array[back - 1];
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) {
            Object temp = array[front];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            back--;
            return temp;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return (back == front);
    }

    @Override
    public void makeEmpty() {
        Object[] temp = new Object[DEFAULT_CAPACITY];
        this.array = temp;
        back = front = 0;
    }

    public void resize(int pos) {
        if ((pos > array.length - 1)) {
            Object[] temp = new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }

            array = temp;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Sem Fila");
        } else {
            for (int i = front; i < back; i++) {
                System.out.print("Elemento " + i + " : ");
                System.out.println(array[i]);
            }
        }
    }
}
