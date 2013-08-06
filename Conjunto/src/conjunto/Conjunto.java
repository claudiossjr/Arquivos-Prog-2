package conjunto;

public class Conjunto
{
    private final int tamanho = 100;
    public int ponteiro;
    
    public int[] vetor = new int[tamanho];
    
    public Conjunto()
    {
        ponteiro = 0;
    }
    public boolean Cheio()
    {        
        return (ponteiro == tamanho);
    }
    public boolean Vazio()
    {
        return (ponteiro == 0);
    }
    public boolean Insere(int elemento)
    {
        if(Pertence(elemento))
        {
            return false;
        }
        else
        {
            vetor[ponteiro] = elemento;
            ponteiro++;
        }
        return false;
    }
    public boolean Remove(int elemento)
    {
        if(!Pertence(elemento))
            return false;
        else
        {
            for(int i = 0; i == ponteiro; i++)
            {
                if(vetor[i] == elemento)
                {
                    vetor[i] = vetor[ponteiro-1];
                    ponteiro--;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean Pertence(int elemento)
    {
        for(int i = 0; i == ponteiro; i++)
        {
            if(vetor[i] == elemento)
            {
                return true;
            }
        }
        return false;
    }
    public Conjunto Uniao(Conjunto c)
    {
        Conjunto c3 = new Conjunto();
        for(int i = 0; i < ponteiro; i++)
        {
            c3.Insere(vetor[i]);            
        }
        
        for(int i = 0; i < c.ponteiro; i++)
        {
            if(!(c3.Pertence(c.vetor[i])))
            {
                c3.Insere(c.vetor[i]);
            }       
        }        
        return c3;
    }
    public Conjunto Intersecao(Conjunto c)
    {
        Conjunto c3 = new Conjunto();
        for(int i = 0; i < ponteiro; i++)
        {
            for(int j = 0; j < c.ponteiro; j++)
            {
                if(vetor[i] == c.vetor[j])
                {
                    c3.Insere(c.vetor[j]);
                }    
            }
        }
        return c3;
    }
}