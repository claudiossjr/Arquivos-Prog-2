package arquivo;

import java.io.*;
import java.util.Scanner;

public class Arquivo {
    
        protected static Aluno turma[];
        static Scanner in = new Scanner(System.in),arq;
            
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("saida.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        System.out.println("informe a quantidade de alunos na turma");
        int nAlunos = in.nextInt();
        turma = new Aluno[nAlunos];
        
        for (int i = 0; i < turma.length; i++) {
            System.out.println("Informe o nome do aluno");
            String nome = in.next();
            System.out.println("informe a idade do aluno");
            int idade = in.nextInt();
            
            turma[i] = new Aluno(nome,idade);
        }
        
        for (int i = 0; i < turma.length; i++) {
            bw.write(turma[i].getNome()+" "+turma[i].getIdade());
            bw.newLine();
            
        }
   
        bw.close();
        
        leArq("Turma1.txt",6);
    }

    private static void leArq(String saidatxt,int total) throws IOException {
        FileReader fr = new FileReader(saidatxt);
        Aluno[] turmaLida;
        try (BufferedReader br = new BufferedReader(fr)) {
            turmaLida = new Aluno[total];
            int i=0;
            while (i < total){
                String inp = br.readLine();
                arq = new Scanner(inp);
                
                turmaLida[i] = new Aluno(arq.next(), arq.nextInt());
                i++;
            }
        }
        
        for (int j = 0; j < turmaLida.length; j++) {
            System.out.println("Nome :"+turmaLida[j].getNome());
            System.out.println("Idade :"+ turmaLida[j].getIdade());
            System.out.println();
        }
    }
}