/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tc claudio
 */
public class Arquivos {

    Formatter output;
    Account acc[] = new Account[2];

    public void creatFile() {
        try {
            output = new Formatter("in.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public void openFile() throws IOException {

        FileReader fr = new FileReader("entrada.txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner in;
        int i= 0;

        while (br.ready()) {
            String linha = br.readLine();
            in = new Scanner(linha);
            acc[i] = new Account();
            acc[i].setName(in.next());
            acc[i].setIdade(in.nextInt());
            acc[i].setEmail(in.next());
            System.out.println(acc[i].getName());
            System.out.println(acc[i].getIdade());
            System.out.println(acc[i].getEmail());
            System.out.println();
            i++;
        }
        br.close();
    }

    public void inseriNoArquivo() throws IOException {
        FileWriter fw = new FileWriter("in.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < acc.length; i++) {
        String s = acc[i].getName()+" " + acc[i].getIdade()+" "+ acc[i].getEmail();
        bw.write(s);
        bw.newLine();
        }
        bw.close();
    }
}
