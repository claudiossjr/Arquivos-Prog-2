package exerciciosprova;

import java.util.Scanner;

public class Exercicio1 
{
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma palavra");
        String Palavra1= in.nextLine();
        System.out.println("Insira uma outra palavra");
        String Palavra2 = in.nextLine();
        
        System.out.println(MaiorPalavra(Palavra1, Palavra2));        
    }
    
    public static boolean MaiorPalavra(String Pa1, String Pa2)
    {
        boolean Palavra1 = true;
        boolean Palavra2 = true;
        int ContPa1 = 1, ContPa2 = 1, Cont1 = 0, Cont2 =0;
        
        String subPalavra1 = Pa1 ;
        
        //Verificação de palavras da primeira string
        while(Palavra1)
        {
            Palavra1 = false;
            Cont1 = subPalavra1.indexOf(" ");
            
            if (Cont1 > 0)
            {
                Palavra1 = true;
                subPalavra1 = subPalavra1.substring(Cont1+1, subPalavra1.length());
                ContPa1++;
            }
        }
        
        String subPalavra2 = Pa2 ;
        
        //Verificação de palavras da segunda String
        while (Palavra2)
        {
            Palavra2 = false;
            Cont2 = subPalavra2.indexOf(" ");
            
            if (Cont2 > 0)
            {
                Palavra2 = true;
                subPalavra2 = subPalavra2.substring(Cont2+1, subPalavra2.length());
                ContPa2++;
            }
        }
        
        System.out.println(ContPa1);
        System.out.println(ContPa2);
        
        //Comparação Entre o tamanho
        if(ContPa1 > ContPa2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
        
    }
}