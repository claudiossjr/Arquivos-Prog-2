/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import classes.Quadrado;

/**
 *
 * @author tc claudio
 */
public class Grid {
    
    protected Quadrado quadrado[];
    
    public double expression(double x, double y){
        return Math.pow(x, 2);
    }
    
    public void criarGrid(int min, int max){
        int tamanho = max-min;
        quadrado = new Quadrado[tamanho*tamanho];
        
    }
}
