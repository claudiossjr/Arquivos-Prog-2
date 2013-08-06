/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessamentoDePrograma;

import java.io.IOException;

/**
 *
 * @author tc claudio
 */
public class main {
    public static void main( String[] args) throws IOException{
        ProcessamentoDePrograma pdg = new ProcessamentoDePrograma("euu.txt");
        //pdg.criarAlunos();
        pdg.ler();
    }
}
