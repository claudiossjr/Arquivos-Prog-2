/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadObject;

/**
 *
 * @author tc claudio
 */
public class Teste {
    public static void main(String[] args) {
        LerObjeto lo = new LerObjeto();
        lo.abrirArquivo("texto.ser");
        lo.LerArquivo();
        lo.imprimi();
    }
}
