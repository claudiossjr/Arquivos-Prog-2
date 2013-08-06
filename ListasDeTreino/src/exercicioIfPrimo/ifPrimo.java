package exercicioIfPrimo;

public class ifPrimo 
{
    public static void seNumPrimo(int n)
    {
        boolean primo=true;
        for (int i = 2; i < n-1; i++) 
        {
            if(n%i == 0)
            {
                primo = false;
                break;
            }
        }
        
        if(!(primo))
        {
            System.out.println(n+" numero nao primo");
        }else
        {
            System.out.println(n+" numero é primo");
        }
    }
}
