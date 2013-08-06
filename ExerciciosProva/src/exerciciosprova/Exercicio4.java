package exerciciosprova;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        String Vet[] = {"Claudio", "Felipe", "Stella", "Rita"};
        
        for (int i = 0; i < Vet.length; i++) 
        {
            for (int j = 0; j < Vet.length; j++) 
            {
                if(Vet[i].length() < Vet[j].length())
                {
                    String aux = Vet[j];
                    Vet[j] = Vet[i];
                    Vet[i] = aux;
                }
            }
        }
        
        for (int i = 0; i < Vet.length; i++) 
        {
            System.out.println(Vet[i]+" ");
        }
    }
}