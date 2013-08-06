/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author tc claudio
 */
public class Quadrado {
    protected Ponto pontos[];
            
    public Quadrado(Ponto[] pontos){
        this.pontos = pontos;
    }
    
    public Ponto[] getVetPontos(){
        return pontos;
    }
    
    public Ponto getPonto(int i){
        return pontos[i];
    }
}
