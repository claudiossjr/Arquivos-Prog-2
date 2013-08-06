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
    protected static final int QUANT_PONTOS = 4;
    protected int tipoDeQuadrado;
    
    public Quadrado(Ponto p,double deltaX,double deltaY){
        pontos = new Ponto[QUANT_PONTOS];
        pontos[0] = new Ponto(p.getX(),p.getY());
        pontos[1] = new Ponto(p.getX()+deltaX,p.getY());
        pontos[2] = new Ponto(p.getX()+deltaX,p.getY()+deltaY);
        pontos[3] = new Ponto(p.getX(),p.getY()+deltaY);
        
        analiseQuadrado();
    }
    
    private void analiseQuadrado(){
        if((!pontos[0].getSinal()&&!pontos[1].getSinal()&&!pontos[2].getSinal()&&!pontos[3].getSinal())||(pontos[0].getSinal()&&pontos[1].getSinal()&&pontos[2].getSinal()&&pontos[3].getSinal())){
            tipoDeQuadrado = 0;
        }
        if((!pontos[0].getSinal()&&!pontos[1].getSinal()&&!pontos[2].getSinal()&&pontos[3].getSinal())||(pontos[0].getSinal()&&pontos[1].getSinal()&&pontos[2].getSinal()&&!pontos[3].getSinal())){
            tipoDeQuadrado = 1;
        }
        if((!pontos[0].getSinal()&&!pontos[1].getSinal()&&pontos[2].getSinal()&&!pontos[3].getSinal())||(pontos[0].getSinal()&&pontos[1].getSinal()&&!pontos[2].getSinal()&&pontos[3].getSinal())){
            tipoDeQuadrado = 2;
        }
        if((!pontos[0].getSinal()&&!pontos[1].getSinal()&&pontos[2].getSinal()&&pontos[3].getSinal())||(pontos[0].getSinal()&&pontos[1].getSinal()&&!pontos[2].getSinal()&&!pontos[3].getSinal())){
            tipoDeQuadrado = 3;
        }
        if((!pontos[0].getSinal()&&pontos[1].getSinal()&&!pontos[2].getSinal()&&!pontos[3].getSinal())||(pontos[0].getSinal()&&!pontos[1].getSinal()&&pontos[2].getSinal()&&pontos[3].getSinal())){
            tipoDeQuadrado = 4;
        }
        if((!pontos[0].getSinal()&&pontos[1].getSinal()&&pontos[2].getSinal()&&!pontos[3].getSinal())||(pontos[0].getSinal()&&!pontos[1].getSinal()&&!pontos[2].getSinal()&&pontos[3].getSinal())){
            tipoDeQuadrado = 6;
        }
        if((!pontos[0].getSinal()&&pontos[1].getSinal()&&pontos[2].getSinal()&&pontos[3].getSinal())||(pontos[0].getSinal()&&!pontos[1].getSinal()&&!pontos[2].getSinal()&&!pontos[3].getSinal())){
            tipoDeQuadrado = 7;
        }
        if((!pontos[0].getSinal()&&!pontos[1].getSinal()&&!pontos[2].getSinal()&&!pontos[3].getSinal())){
            double temp =0;
            for (int i = 0; i < pontos.length; i++) {
                temp += pontos[i].getValorExpressao()/4;
            }
            
            if (temp >= 0)tipoDeQuadrado = 51;
            else tipoDeQuadrado = 52;
        }
        if((!pontos[0].getSinal()&&!pontos[1].getSinal()&&!pontos[2].getSinal()&&!pontos[3].getSinal())){
           double temp =0;
            for (int i = 0; i < pontos.length; i++) {
                temp += pontos[i].getValorExpressao()/4;
            }
            
            if (temp >= 0)tipoDeQuadrado = 101;
            else tipoDeQuadrado = 102;
        }
    }
    
    public int getTipoDeQuadrado(){
        return tipoDeQuadrado;
    }
    
    public Ponto getPonto(int pos){
        return pontos[pos];
    }

    public void converteQuadrado(Ponto p,int deltaX, int deltaY) {
        pontos[0].setX(p.getX());
        pontos[0].setY(p.getY());
        pontos[1].setX(p.getX()+deltaX);
        pontos[1].setY(p.getY());
        pontos[2].setX(p.getX()+deltaX);
        pontos[2].setY(p.getY()+deltaY);
        pontos[3].setX(p.getX());
        pontos[3].setY(p.getY()+deltaY);
    }
}
