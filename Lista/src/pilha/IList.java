/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author lcc
 */
public interface IList {
    void push(Object x);// inserir objeto
    Object pop();// remover o objeto e indica qual foi o objeto retirado
    Object top(); // consulta o objeto e retorna, nao tira o objeto da pilha
    boolean isEmpty();
    void makeEmpty();
}
