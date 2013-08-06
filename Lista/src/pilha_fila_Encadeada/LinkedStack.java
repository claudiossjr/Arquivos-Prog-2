/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila_Encadeada;


/**
 *
 * @author tc claudio
 */
public class LinkedStack {

    protected Node primeiro;
    protected Node ultimo;

    public LinkedStack() {
        primeiro = ultimo = null;
    }

    public void push(Object o) {
        if (isEmpty()) {
            Node ln = new Node(o,null);
            primeiro = ultimo = ln;
        }else{
            Node ln = new Node(o,null);
            ultimo.setNextNode(ln);
            ultimo = ln;
        }
    }

    public Object pop() {
         if (!(isEmpty())) {
            if (primeiro == ultimo) {
                Node ln = primeiro;
                primeiro = ultimo = null;
                return ln.data;
            } else {
                Node ln =primeiro;
                
                while(true)
                {
                    if(ln.getNext() == ultimo){
                        Node ln2 = ultimo;
                        ultimo = ln;
                        ultimo.setNextNode(null);
                        return ln2.getObject();
                    }
                    ln = ln.getNext();
                }
            }
        }
        return null;
    }

    public Object top() {
        return ultimo.getObject();
    }

    public boolean isEmpty() {
        return (primeiro == null && ultimo == null);
    }

    public void makeEmpty() {
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
