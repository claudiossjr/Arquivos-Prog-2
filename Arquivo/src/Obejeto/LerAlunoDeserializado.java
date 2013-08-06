/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Obejeto;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tc claudio
 */
public class LerAlunoDeserializado {
    protected BufferedReader input;
    protected Scanner in;
    
    public AlunoSerializado[] lerArquivos(){
        AlunoSerializado as[] = new AlunoSerializado[6];
        try {
            input = new BufferedReader(new FileReader("Turma1.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Erro em Abrir arquivo par leitura");
        }
        int i = 0;
        try {
            while(input.ready()){
                String str = input.readLine();
                in = new Scanner(str);
                as[i] = new AlunoSerializado();
                as[i].setMatricula(in.nextInt());
                as[i].setNome(in.next());
                as[i].setIdade(in.nextInt());
                i++;
            }
        } catch (IOException ex) {
            System.out.println("erro para ler  arquivo");
        }
        finally{
            try {
                input.close();
            } catch (IOException ex) {
                System.out.println("Erro em fechar arquivo para leitura");
            }
        }
        return as;
    }
    
    public void chamaGravaArq(AlunoSerializado aluno[]){
        EscreverObjeto eo = new EscreverObjeto();
        eo.Escrever(aluno);
        eo.fecharArq();
    }
}
