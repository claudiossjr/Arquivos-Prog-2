package treino;

import java.util.Scanner;

public class Treino {

    public static void main(String[] args) 
    {
        
        int cont = 2;
        String nome = "claudio";
        double nota = (double)10.0;
        Aluno vetAluno = new Aluno(nome, nota);
        Aluno vetAluno1 = new Aluno("joao", 7.0d);
        
        if(vetAluno.compararCom(vetAluno1) == 0)
        {
            System.out.println("notas iguais");
        }
        else if(vetAluno.compararCom(vetAluno1) == 1)
        {
            System.out.println("Maior Nota é do: "+ vetAluno.getNome());
        }
        else if(vetAluno.compararCom(vetAluno1) == -1)
        {
            System.out.println("Maior nota é do: "+ vetAluno1.getNome());
        }
        
        System.out.println("");
        System.out.println("Iniciando Secção de Automoveis");
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        
        String marca;
        float velocidadeMaxima;
        System.out.println("Insira o nome da marca do Carro");
        marca = in.next();
        
        System.out.println("Insira a Velocidade Maxima do Carro");
        velocidadeMaxima = in.nextFloat();
    }
}
