/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author tc claudio
 */
public class Ponto {

    protected double x;
    protected double y;
    protected double valorExpressao;
    protected boolean sinal;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;

        valorExpressao = expression(x, y);

        if (valorExpressao >= 0)sinal = true;
        else sinal  = false;
    }
    
    public Ponto(){
        
    }
    
    private double expression(double x, double y){
        return x-y;
    }
    
    public double getX(){
    return x;
    }

    public double getY(){
    return y;
    }

    public void setX(double x){
    this.x = x;
    }

    public void setY(double y){
    this.y = y;
    }
    
    public boolean getSinal(){
        return sinal;
    }
    
    public double getValorExpressao(){
        return valorExpressao;
    }
}
