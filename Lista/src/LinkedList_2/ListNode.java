/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList_2;

/**
 *
 * @author tc claudio
 */
public class ListNode {

    protected Object data;
    protected ListNode nextNode;
    protected ListNode prevNode;

    public ListNode(ListNode prev, Object o, ListNode next) {
        data = o;
        nextNode = next;
        prevNode = prev;
    }

    public Object getObject() {
        return data;
    }
    
    public ListNode getNext() {
        return nextNode;
    }

    public ListNode getPrev() {
        return prevNode;
    }


    public void setNext(ListNode next) {
        nextNode = next;
    }

    public void setPrev(ListNode prev) {
        prevNode = prev;
    }
}
