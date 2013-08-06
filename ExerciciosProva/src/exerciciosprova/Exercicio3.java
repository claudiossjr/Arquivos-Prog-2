package exerciciosprova;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
        int Linha = 2, Coluna = 3;
        int mat[][] = new int[Linha][Coluna];
        
        for (int i = 0; i < Linha; i++) 
        {
            for (int j = 0; j < Coluna; j++) 
            {
                mat[i][j] = (int)(1+Math.random()*10);
            }
        }
        
        for (int i = 0; i < Linha; i++) 
        {
            for (int j = 0; j < i+1; j++) 
            {
                mat[j][i] = mat[i][j];
            }
        }
        
        for (int i = 0; i < Linha; i++) 
        {            
                mat[i][i] = 0;
        }
        
        for (int i = 0; i < Linha; i++) 
        {
            for (int j = 0; j < Coluna; j++) 
            {
                if(i != j)
                {
                    mat[i][i] += mat[i][j];
                }
            }
        }
        
        for (int i = 0; i < Linha; i++) 
        {   
            for (int j = 0; j < Coluna; j++) 
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}
