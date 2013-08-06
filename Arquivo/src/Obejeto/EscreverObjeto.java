/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Obejeto;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tc claudio
 */
public class EscreverObjeto {

    protected ObjectOutputStream output;

    public void Escrever(AlunoSerializado aluno[]) {
        try {
            try {
                output = new ObjectOutputStream(new FileOutputStream("texto.ser"));
            } catch (FileNotFoundException ex) {
                System.out.println("erro em gravaar o arquivo");
            }
        } catch (IOException ex) {
            System.out.println("error");
        }
        finally{
            for (int i = 0; i < aluno.length; i++) {
                try {
                    output.writeObject(aluno[i]);
                } catch (IOException ex) {
                    System.out.println("erro em Gravar AlunoSerializado");
                }
            }
        }
    }
    
    public void fecharArq(){
        try {
                output.close();
            } catch (IOException ex) {
                System.out.println("Erro em fechar o arquivo");
            }
    }
}
