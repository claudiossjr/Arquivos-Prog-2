package exercicioFatora;

public class Fatora 
{
    public static void fatoraNumero(int num)
    {
        int i = 2,cont=0,contNumero=0;
        int numCont[] = new int[100];
        int nume[] = new int[100];
        boolean acabou = true,encrementa;
        
        while(acabou)
        {
            encrementa = false;
            while(num%i == 0)
            {
                num = num/i;
                nume[cont] = i;
                numCont[contNumero]++;
                
                encrementa = true;
                
            }
            if(encrementa)
            {
            contNumero++;
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
            System.out.println(nume[j]+"^"+numCont[j]);
            
        }
        
    }
}
