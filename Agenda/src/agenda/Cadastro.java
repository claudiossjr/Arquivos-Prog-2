package agenda;

import java.util.Scanner;

public class Cadastro 
{
    private Scanner in = new Scanner(System.in);
    private Amigo[] Contatos = new Amigo[100];
    private String Nome, DataAniversario, Telefone;
    private int Cont = 0;
    
    public void Cadastro()
    {
        if (Cont == 100)
            System.out.println("Agenda Lotada");
        else
        {
            System.out.println("Insira o nome");
            Nome = in.next();
            
            boolean Existe = true;
            
            while(Existe)
            {
                Existe = false;
                for(int i = 0; i< Cont; i++)
                {
                    if(Nome.equalsIgnoreCase(Contatos[i].Nome))
                    {
                        Existe = true;
                        System.out.println("Nome de Amigo Existente");
                        System.out.println("Insira um novo nome");
                        Nome = in.next();
                    }    
                }                
            }
            
            System.out.println("Insira a data de aniversario Ex.:DD/MM/AAAA");
            DataAniversario = in.next();
            System.out.println("Insira o Telefone Ex.:NNNN-NNNN");
            Telefone = in.next();            
        
            Contatos[Cont] = new Amigo(Nome, DataAniversario, Telefone);
            Cont++;
        
            Ordena();
        }
    }
    
    public void Busca()
    {
        int ContAmigo=0;
        if(Cont == 0)
            System.out.println("Não há Contatos Cadastrados");
        else
        {
            System.out.println("Insira um Nome Para Busca");
            String NomeBusca = in.next();   
            for(int i = 0; i<Cont;i++)
            {
                if(NomeBusca.equalsIgnoreCase(Contatos[i].Nome))
                {
                    ContAmigo++;
                    System.out.println("Amigo Encontrado");
                    System.out.println("Nome: "+Contatos[i].Nome);
                    System.out.println("Data de Aniversário"+Contatos[i].DataAniversario);
                    System.out.println("Telefone"+Contatos[i].Telefone);
                    System.out.println();
                }
            }
            
            if(ContAmigo == 0)
            {
                System.out.println("Usuário não Cadastrado");
            }
        }    
    }
    
    public void Ordena()
    {
        for(int i = 0; i < Cont;i++)
        {
            for (int j = 0; j < Cont;j++)
            {
                int Compara = Contatos[i].Nome.compareToIgnoreCase(Contatos[j].Nome);
            
                if(Compara < 0)
                {
                    Nome = Contatos[i].Nome;
                    DataAniversario = Contatos[i].DataAniversario;
                    Telefone = Contatos[i].Telefone;
                    
                    Contatos[i].Nome = Contatos[j].Nome;
                    Contatos[i].DataAniversario = Contatos[j].DataAniversario;
                    Contatos[i].Telefone = Contatos[j].Telefone;
                    
                    Contatos[j].Nome = Nome;
                    Contatos[j].DataAniversario = DataAniversario;
                    Contatos[j].Telefone = Telefone;
                }
            }
        }        
    } 
    
    public void Listar()
    {
        if(Cont == 0)
            System.out.println("Não há usuários cadastrados");
        else
        {
            System.out.println("Agenda com: "+ Cont +" Amigos");
            for(int i =0; i < Cont;i++)
            {
                System.out.println("Nome: "+ Contatos[i].Nome);
                System.out.println("Data de Aniversario: "+ Contatos[i].DataAniversario);
                System.out.println("Telefone: "+Contatos[i].Telefone);
                System.out.println();
            }    
        }
    }
    
    public void Remove()
    {
        System.out.println("Insira o nome do usuário que deseja remover");
        Nome = in.next();
        int ContAmigo = 0;
        
        for (int i = 0; i < Cont;i++)
        {
            if(Nome.equalsIgnoreCase(Contatos[i].Nome))
            {
                ContAmigo = i;
            }    
        }
        
        
            Contatos[ContAmigo].Nome = Contatos[Cont-1].Nome;
            Contatos[ContAmigo].DataAniversario = Contatos[Cont-1].DataAniversario;
            Contatos[ContAmigo].Telefone = Contatos[Cont-1].Telefone;
            Ordena();            
        
        Cont--;
    }
    
}