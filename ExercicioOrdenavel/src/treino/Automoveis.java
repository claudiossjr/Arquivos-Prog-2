package treino;

public class Automoveis 
{
    private int maxAutomoveis = 100;
    private int numAutomoveis;
    Automovel colecao[] = new Automovel[maxAutomoveis];
    
    public Automoveis()
    {
        this.numAutomoveis = 0;
    }
    
    public void imprimirAuto()
    {
        for(int i = 0; i < colecao.length;i++)
        {
            System.out.println("Marca: "+ colecao[i].getMarca());
            System.out.println("Velocidade Maxima : "+ colecao[i].getVelocidadeMaxima());
        }
    }
    
    public int inserirAuto(Automovel auto)
    {
        if(numAutomoveis >=0 && numAutomoveis < maxAutomoveis)
        {
        colecao[numAutomoveis].setMarca(auto.getMarca());
        colecao[numAutomoveis].setValocidadeMaxima(auto.getVelocidadeMaxima());
        numAutomoveis ++;
        return 1;
        }
        else if(numAutomoveis <= 0 || numAutomoveis >= maxAutomoveis)
        {
            return 0;
        }
        
        
        return 0;
    }
    
    public int removeAutomoveis(Automovel auto)
    {
        if(numAutomoveis == 0)
        {
            return 0;
        }
        else
        {
            for (int i = 0; i < numAutomoveis; i++) 
            {
                if(colecao[i].getMarca().equalsIgnoreCase(auto.getMarca()))
                {
                    if(i != numAutomoveis)
                    {
                    colecao[i].setMarca(colecao[numAutomoveis].getMarca());
                    colecao[i].setValocidadeMaxima(colecao[numAutomoveis].getVelocidadeMaxima());
                    numAutomoveis --;
                    return 1; 
                    }
                    else
                    {
                        numAutomoveis --;
                        return 1;
                    }
                }
            }
        }
        
        return 0;
    }
}
