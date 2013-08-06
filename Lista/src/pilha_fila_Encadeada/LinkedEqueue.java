/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila_Encadeada;

/**
 *
 * @author tc claudio
 */
public class LinkedEqueue {

    protected Node primeiro;
    protected Node ultimo;

    public LinkedEqueue() {
        primeiro = ultimo = null;
    }
    
    public void equeue (Object o){
        if(isEmpty()){
            Node temp = new Node(o,null);
            primeiro = ultimo = temp;
        }else{
            Node temp = new Node(o,null);
            ultimo.setNextNode(temp);
            ultimo = temp;
        }
    }
    
    public Object dequeue(){
        if(!isEmpty()){
            if(primeiro == ultimo){
                Node temp = primeiro;
                primeiro = ultimo = null;
                return temp.getObject();
            }else{
                Node temp = primeiro;
                primeiro = primeiro.nextNode;
                return temp.getObject();
            }
        }
        return null;    
    }
    
    public Object  getFront(){
        return primeiro.getObject();
    }
    
    public boolean isEmpty(){
        return (primeiro == null && ultimo == null);
    }
    
    public void makeEmpty(){
        primeiro = ultimo = null;
    }
    
    public void printListNode() {
        Node ln = primeiro;
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
