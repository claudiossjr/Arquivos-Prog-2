/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro;

import java.io.IOException;

/**
 *
 * @author tc claudio
 */
public class MainPrimeiro {
    public static void main(String[] args) {
        Arquivos arq = new Arquivos();
        try{
        arq.creatFile();
        arq.openFile();
        arq.inseriNoArquivo();
        }catch(IOException e){
            System.out.println(e+ "--\\ vamos que vamos");
        }
    }
}
