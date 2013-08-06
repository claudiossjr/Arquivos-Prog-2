package treino;

public class Aluno implements IComparavel
{
    private String nome;
    private double nota;
    
    public Aluno(String nome, double nota)
    {
        this.nome = nome;
        this.nota = nota;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public double getNota()
    {
        return nota;
    }
    
    public void imprimir()
    {
        System.out.println("Nome: "+ nome);
        System.out.println("Nota: "+ nota);
    }

    @Override
    public int compararCom(IComparavel comparavel) 
    {
        Aluno aluno = (Aluno)comparavel;
        
        if(nota > aluno.getNota())
        {
            return 1;
        }
        else if(nota == aluno.getNota())
        {
            return 0 ;
        }
        else if(nota < aluno.getNota())
        {
            return -1;
        }
        return 0;
    }
    
}
