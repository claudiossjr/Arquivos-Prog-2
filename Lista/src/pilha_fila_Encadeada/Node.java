/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila_Encadeada;


/**
 *
 * @author tc claudio
 */
public class Node {
    protected Object data;
    protected Node nextNode;

       
    public Node (Object object, Node node){
        this.data = object;
        this.nextNode = node;
    }
    
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    public Object getObject(){
        return  data;
    }
    
    public Node  getNext(){
        return nextNode;
    }
}
