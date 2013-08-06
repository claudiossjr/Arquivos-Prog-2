/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CavalinhoMagrelo;

/**
 *
 * @author claudio
 */
public class Casa {
    
    protected  boolean ocupada ;
    protected  int linha;
    protected  int coluna;

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    
}
