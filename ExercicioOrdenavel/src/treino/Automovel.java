package treino;

public class Automovel implements IComparavel
{
    private String marca;
    private float velocidadeMaxima;
    
    public Automovel(String marca, float velocidadeMaxima)
    {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setValocidadeMaxima(float velocidadeMaxima)
    {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public float getVelocidadeMaxima()
    {
        return velocidadeMaxima;
    }
    
    public void imprimir()
    {
        System.out.println("Marca: "+ marca);
        System.out.println("Velocidade Maxima: "+ velocidadeMaxima);
    }

    @Override
    public int compararCom(IComparavel comparavel) 
    {
        Automovel auto = (Automovel)comparavel;
        if(velocidadeMaxima > auto.getVelocidadeMaxima())
        {
            return 1;
        }
        else if(velocidadeMaxima == auto.getVelocidadeMaxima())
        {
            return 0;
        }
        else if(velocidadeMaxima < auto.getVelocidadeMaxima())
        {
            return -1;
        }
        
        return 0;
    }
    
}
