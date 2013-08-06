package agenda;

import java.util.Scanner;

public class Menu 
{
    private Scanner in = new Scanner(System.in);
    private Cadastro cadastro = new Cadastro();
    private String NomeBusca;
    
    public void MenuEscolha() 
    {
        int iOP;
        
        do
        {
            System.out.println("1 - Cadastrar Amigo");
            System.out.println("2 - Buscar Amigo");
            System.out.println("3 - Listar Agenda");
            System.out.println("4 - Para Remover amigo");
            System.out.println("5 - Sair da Agenda");
            System.out.println("Insira uma das opções ");
            iOP = in.nextInt();
            switch(iOP)
            {
                case 1:
                    cadastro.Cadastro();
                    break;
                case 2:                                        
                    cadastro.Busca();
                    break;
                case 3:
                    cadastro.Listar();
                    break;
                case 4:
                    cadastro.Remove();
                    break;
                case 5:
                    System.out.println("SAINDOOO");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(iOP != 5);
    }
}