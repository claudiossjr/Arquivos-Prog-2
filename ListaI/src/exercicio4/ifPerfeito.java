package exercicio4;

public class ifPerfeito 
{
    public static void perfeito(int n)
    {
        int numero = (int)(n/2);
        int cont=0, vet[] = new int[numero];
        
        for (int i = 1; i <= numero; i++) 
        {
            if(n%i == 0)
            {
                vet[cont] = i;
                cont ++;
            }
        }
        
        int soma=0;
        for (int i = 0; i < cont; i++) 
        {
            soma += vet[i];
        }
        
        if (soma == n)
        {
            System.out.println("é perfeito");
        }
        else
        {
            System.out.println("não é perfeito");
        }
    }
    
}
