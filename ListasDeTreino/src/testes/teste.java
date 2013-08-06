package testes;

import exercicioFatora.*;
import exercicioPrimo.Primos;
import exercicioIfPrimo.*;

public class teste 
{

    public static void main(String[] args) 
    {
        int n=179;
        Fatora.fatoraNumero(n);
        System.out.println("");
        Primos.fatosPrimos(n);
        System.out.println("");
        ifPrimo.seNumPrimo(n);
        System.out.println("");
        
    }
}
