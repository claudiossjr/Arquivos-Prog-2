package exerciciosprova;

public class Exercicio5 
{
    public Conjunto Intercecao(Conjunto c)
    {
        Conjunto c3 = new Conjunto();
        
        for (int i = 0; i < ponteiro; i++) 
        {
            for (int j = 0; j < c.ponteiro; j++) 
            {
                if(vetor[i] == c.vetor[j])
                {
                    c3.Insere(vetor[i]);
                }
            }
        }
        return c3;
    }
}
