/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import classes.Ponto;
import classes.Quadrado;

/**
 *
 * @author tc claudio
 */
public class Grid {
    protected Quadrado matQuad[][];
    protected double xMin,xMax,yMin,yMax;
    protected int resolucao;
    
    public Grid(double xMin, double yMin, double xMax, double yMax, int resolucao){
        this.xMin = xMin;
        this.yMin = yMin;
        this.xMax = xMax;
        this.yMax = yMax;
        this.resolucao = resolucao;
        matQuad = new Quadrado[resolucao][resolucao];
    }

    public void criarGrid(){
        double deltaX = (xMax-xMin)/resolucao;
        double deltaY = (yMax-yMin)/resolucao;
        
        for (int i = 0; i < matQuad.length; i++) {
            for (int j = 0; j < matQuad.length; j++) {
                Ponto temp = new Ponto(xMin+j*deltaX,yMin+i*deltaY);
                matQuad[i][j] = new Quadrado(temp,deltaX,deltaY);
            }
        }
    }
    
    public Quadrado[][] getMatQuadrado(){
        return matQuad;
    }
    
    public void converteGrid(double xMin, double yMin, double xMax, double yMax, int resolucao){
        int deltaX = (int) ((xMax-xMin)/resolucao);
        int deltaY = (int) ((yMax-yMin)/resolucao);
        
        for (int i = 0; i < matQuad.length; i++) {
            for (int j = 0; j < matQuad.length; j++) {
                Ponto temp = new Ponto(xMin+j*deltaX,yMin+i*deltaY);
                matQuad[i][j].converteQuadrado(temp,deltaX,deltaY);
            }
        }
    }
}
