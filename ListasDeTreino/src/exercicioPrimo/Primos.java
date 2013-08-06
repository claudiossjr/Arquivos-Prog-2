package exercicioPrimo;

public class Primos 
{
    public static void fatosPrimos(int num)
    {
        int i = 2,cont=0,contNumero=0, cont1 = 1;
        int nume[] = new int[100];
        boolean acabou = true,encrementa;
        
        while(acabou)
        {
            encrementa = false;
            while(num%i == 0)
            {
                num = num/i;
                nume[cont] = i;
                encrementa = true;
            }
            if(encrementa)
            {
            cont++;
            }
            i++;

            if(num == 1)
            {
                acabou = false;
            }
        }
        
        for (int j = 0; j < cont; j++) 
        {
            System.out.println(nume[j]);
            
        }
    }
}
