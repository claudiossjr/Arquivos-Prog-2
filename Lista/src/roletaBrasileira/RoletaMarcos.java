/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roletaBrasileira;

import fila.Fila;
import pilha_fila_array.ArrayQueue;

/**
 *
 * @author lcc
 */
public class RoletaMarcos {
    
    public int constVencedor(int parametroTirar, ArrayQueue fl){
        if(fl.getBack() == fl.getFront()){
            return (Integer)fl.getBack();
        }else{
            for (int i = 0; i < parametroTirar-1; i++) {
                int k = (Integer)fl.dequeue();
                fl.enqueue(k);
            }
            System.out.println("removi: "+fl.dequeue());
            return constVencedor(parametroTirar, fl);
        }
    }
}
