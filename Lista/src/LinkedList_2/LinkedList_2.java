/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_2;

import listaEncadeada.IList;

/**
 *
 * @author tc claudio
 */
public class LinkedList_2 implements IList { 
    

    protected ListNode primeiro;
    protected ListNode ultimo;

    public LinkedList_2() {
        primeiro = ultimo = null;
    }

    @Override
    public void insertAtFront(Object o) {
        if (isEmpty()) {
            ListNode ln = new ListNode(null, o, null);
            primeiro = ultimo = ln;
        } else {
            ListNode ln = new ListNode(null, o, primeiro);
            primeiro.setPrev(ln);
            primeiro = ln;
        }
    }

    @Override
    public void insertAtBack(Object o) {
        if (isEmpty()) {
            ListNode ln = new ListNode(null, o, null);
            primeiro = ultimo = ln;
        } else {
            ListNode ln = new ListNode(ultimo, o, null);
            ultimo.setNext(ln);
            ultimo = ln;
        }
    }

    @Override
    public void makeEmpty() {
        primeiro = ultimo = null;
    }

    @Override
    public boolean isEmpty() {
        return (primeiro == null && ultimo == null);
    }

    @Override
    public Object removeFromBack() {
        if (!isEmpty()) {
            if (primeiro == ultimo) {
                ListNode ln = ultimo;
                primeiro = ultimo = null;
                return ln.getObject();
            } else {
                ListNode ln = ultimo;
                ultimo = ultimo.getPrev();
                ultimo.setNext(null);
                return ln.getObject();
            }
        }
        return null;
    }

    @Override
    public Object removeFromFront() {
        if (!isEmpty()) {
            if (primeiro == ultimo) {
                ListNode ln = primeiro;
                primeiro = ultimo = null;
                return ln.getObject();
            } else {
                ListNode ln = primeiro;
                primeiro = primeiro.getNext();
                primeiro.setPrev(null);
                return ln.getObject();
            }
        }
        return null;
    }

    public Object getFront() {
        return primeiro.getObject();
    }

    public Object getBack() {
        return ultimo.getObject();
    }

    public void printList() {
        ListNode ln = primeiro;
        if (isEmpty()) {
            System.out.println("a Lista esta vazia");
        } else {
            while (ln != null) {
                System.out.println(ln.getObject());
                ln = ln.getNext();
            }
        }
    }
}