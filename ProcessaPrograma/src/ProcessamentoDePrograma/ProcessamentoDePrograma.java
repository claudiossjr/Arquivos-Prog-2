package ProcessamentoDePrograma;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcessamentoDePrograma {
    protected Aluno[] alunos = new Aluno[3];
    protected Aluno[] alunos1 = new Aluno[3];
    protected Scanner in = new Scanner(System.in);
    protected FileReader fr;
    protected BufferedReader bf ;
    protected FileWriter fw ;
    protected BufferedWriter bw;
            
    public ProcessamentoDePrograma(String fileName)
    {
        try{
            //fw = new FileWriter(new File(fileName));
           // bw = new BufferedWriter(fw);
            fr = new FileReader(new File(fileName));
            bf = new BufferedReader(fr);
            
            
            
        } catch(IOException e){
            
        }
    }
    
    public void escrever(Aluno aluno){
        try {
            String str = aluno.getNome() + " " + aluno.getMatricula();
            bw.write(str);
            bw.newLine();
            
        } catch (IOException ex) {
            Logger.getLogger(ProcessamentoDePrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ler() throws IOException{
       int i = 0, g = fr.read();
        
       while (g > -1){
            g = fr.read();
            String str = bf.readLine();
            Scanner input = new Scanner(str);
            String nome = input.next();
            String matr = input.next();
            alunos1[i] = new Aluno(nome, matr);
            i++;
       }
       bf.close();
       imprimir();
    }
    
    public void criarAlunos() throws IOException{
        boolean roda;
        int i = 0;
        do{
            roda = false;
            if(i < 3){
                System.out.println("Insira o nome");
                String nome = in.next(); 
                System.out.println("Insira a Matricula");
                String matricula = in.next(); 
                alunos[i] = new Aluno(nome, matricula);
                escrever(alunos[i]);
                roda = true;
                i++;
            }
            
            
        }while(roda);
        
        bw.close();
    }
    
    public void imprimir(){
        System.out.println("");
        for (int i = 0; i < alunos1.length; i++) {
            System.out.println(alunos1[i].getNome()+ " " +alunos1[i].getMatricula());
        }
    }
}
