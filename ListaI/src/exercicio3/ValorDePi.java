package exercicio3;

public class ValorDePi 
{
    public static void seriePi()
    {
        double pi = 0;
        for (int i = 0; i < 1000000; i++) 
        {
            pi += (double)((4.0/((2.0*i)+1)) * Math.pow(-1.0, i));
            
            System.out.println("quando i = " + i + "pi vale: "+ pi);
        }
    }
}
