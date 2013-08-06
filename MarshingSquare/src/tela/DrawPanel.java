/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import classes.Ponto;
import classes.Quadrado;
import java.awt.Graphics;
import javax.swing.JPanel;
import logica.Grid;

/**
 *
 * @author tc claudio
 */
public class DrawPanel extends JPanel{
    protected Grid grid;
    protected double xMin,yMin,xMax,yMax;
    protected int resolucao;
    protected Quadrado matQuadrado[][];
    public DrawPanel(double xMin, double yMin, double xMax, double yMax, int resolucao){
        grid = new Grid(xMin,yMin,xMax,yMax,resolucao);
        this.xMin = xMin;
        this.yMin = yMin;
        this.xMax = xMax;
        this.yMax = yMax;
        this.resolucao = resolucao;
       
    }
    
    @Override
    public void printComponent(Graphics g){
        grid.criarGrid();
        grid.converteGrid(0, getHeight(), getWidth(), 0, resolucao);
        matQuadrado = grid.getMatQuadrado();
        super.paintComponent(g);
        converterQuadrados();
        
        for (int i = 0; i < matQuadrado.length; i++) {
            for (int j = 0; j < matQuadrado.length; j++) {
                drawLines(matQuadrado[i][j],g);
            }
        }
        
    }

    private void converterQuadrados() {
        for (int i = 0; i < matQuadrado.length; i++) {
            for (int j = 0; j < matQuadrado.length; j++) {
                converterPontos(matQuadrado[i][j]);
            }
        }
    }

    private void converterPontos(Quadrado quadrado) {
        for (int i = 0; i < 4; i++) {
            Ponto temp = quadrado.getPonto(i);
            temp.setX(transformaX(temp.getX()));
            temp.setY(transformaY(temp.getY()));
        }
    }
    
    private double transformaX(double x){
        double novoX=((x-xMin)/(xMax-xMin))*(getWidth());
        return novoX;
    }
    
    private double transformaY(double y){
        double novoY=((y-yMin)/(yMax-yMin))*(getHeight());
        return novoY;
    }

    private void drawLines(Quadrado q,Graphics g) {
        Ponto medio01= new Ponto();
        medio01.setX((q.getPonto(0).getX()+q.getPonto(1).getX())/2);
        medio01.setY((q.getPonto(0).getY()+q.getPonto(1).getY())/2);
        Ponto medio12= new Ponto();
        medio12.setX((q.getPonto(1).getX()+q.getPonto(2).getX()/2));
        medio12.setY((q.getPonto(1).getY()+q.getPonto(2).getY()/2));
        Ponto medio23= new Ponto();
        medio23.setX((q.getPonto(2).getX()+q.getPonto(3).getX()/2));
        medio23.setY((q.getPonto(2).getY()+q.getPonto(3).getY()/2));
        Ponto medio03= new Ponto();
        medio03.setX((q.getPonto(0).getX()+q.getPonto(3).getX()/2));
        medio03.setY((q.getPonto(0).getY()+q.getPonto(3).getY()/2));
        
        switch(q.getTipoDeQuadrado()){
            case 0://caso 0
                break;
            case 1://caso 1
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio03.getX(),(int) medio03.getY());
                break;
            case 2://caso 2
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio12.getX(),(int) medio12.getY());
                break;
            case 3://caso 3
                g.drawLine((int)medio03.getX(),(int) medio03.getY(),(int) medio12.getX(),(int) medio12.getY());
                break;
            case 4://caso 4
                g.drawLine((int)medio12.getX(),(int) medio12.getY(),(int) medio23.getX(),(int) medio23.getY());
                break;
            case 6://caso 6
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio23.getX(),(int) medio23.getY());
                break;
            case 7://caso 7
                g.drawLine((int)medio23.getX(),(int) medio23.getY(),(int) medio03.getX(),(int) medio03.getY());
                break;
            case 51:// caso 5 vermelha
                g.drawLine((int)medio12.getX(),(int) medio12.getY(),(int) medio23.getX(),(int) medio23.getY());
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio03.getX(),(int) medio03.getY());
                break;
            case 52://caso 5 preta
                g.drawLine((int)medio23.getX(),(int) medio23.getY(),(int) medio03.getX(),(int) medio03.getY());
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio12.getX(),(int) medio12.getY());
                break;
            case 101:// caso 10 vermelha
                g.drawLine((int)medio23.getX(),(int) medio23.getY(),(int) medio03.getX(),(int) medio03.getY());
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio12.getX(),(int) medio12.getY());
                break;
            case 102://caso 10 preta
                g.drawLine((int)medio12.getX(),(int) medio12.getY(),(int) medio23.getX(),(int) medio23.getY());
                g.drawLine((int)medio01.getX(),(int) medio01.getY(),(int) medio03.getX(),(int) medio03.getY());
                break;
        }
    }
}
