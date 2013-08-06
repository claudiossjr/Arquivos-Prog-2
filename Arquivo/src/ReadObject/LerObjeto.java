/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadObject;

import Obejeto.AlunoSerializado;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tc claudio
 */
public class LerObjeto {

    protected ObjectInputStream input;
    protected AlunoSerializado as[];

    public void abrirArquivo(String nome) {
        try {
            try {
                input = new ObjectInputStream(new FileInputStream(nome));
            } catch (FileNotFoundException ex) {
                System.out.println("Arquivo nao existente");
            }
        } catch (IOException ex) {
            System.out.println("Erro em Abrir arquivo");
        }
    }

    public void LerArquivo() {
        as = new AlunoSerializado[6];
        int i = 0;
        while (i < 6) {
            try {
                as[i] = (AlunoSerializado) input.readObject();
            } catch (IOException ex) {
                System.out.println("erro em ler objeto");
            } catch (ClassNotFoundException ex) {
                System.out.println("erro no typecasting");
            }
            i++;
        }
        try {
            input.close();
        } catch (IOException ex) {
            System.out.println("erro em fechar o arquivo");
        }
    }

    public void imprimi() {
        for (int i = 0; i < as.length; i++) {
            System.out.println("");
            System.out.println("Matriculoa: " + as[i].getMatricula());
            System.out.println("Nome: " + as[i].getNome());
            System.out.println("Idade: " + as[i].getIdade());
            System.out.println("");
        }
    }
}
