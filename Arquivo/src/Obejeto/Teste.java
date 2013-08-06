/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Obejeto;

/**
 *
 * @author tc claudio
 */
public class Teste {
    public static void main(String[] args) {
        LerAlunoDeserializado lad=new LerAlunoDeserializado();
        AlunoSerializado as[] = lad.lerArquivos();
        lad.chamaGravaArq(as);
    }
}
