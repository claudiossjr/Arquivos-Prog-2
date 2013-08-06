package teste;

import arquivos.Arquivo1;
import java.io.IOException;


public class Main 
{
    public static void main(String[] args) {
        try {
            Arquivo1.criaArq("saida");
            Arquivo1.leArq("saida");
            System.out.println("");
            Arquivo1.criaArq("saida1");
            Arquivo1.leArq("saida1");
            System.out.println("");
            Arquivo1.mistura("saida","saida1","tro");
            Arquivo1.leArq("tro");
        } catch (IOException ex) {
            System.out.println(" se fudeu");
        }
    }
}
