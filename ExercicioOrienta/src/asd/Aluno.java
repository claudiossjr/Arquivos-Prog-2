package asd;

public class Aluno extends Pessoa {
    private float cr;
    private String curso;
    private int numeroDeDisciplinas;

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        if(cr > 0)
        {
        this.cr = cr;
        }
        else
        {
            System.out.println("CR invalido");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumeroDeDisciplinas() {
        return numeroDeDisciplinas;
    }

    public void setNumeroDeDisciplinas(int numeroDeInscricao) {
        if(numeroDeDisciplinas > 0)
        {
        this.numeroDeDisciplinas = numeroDeInscricao;
        }
        else
        {
            System.out.println("numero de disciplinas Invalido");
        }
    }
    
    public void alteraAluno(String nome, String endereco, String telefone, String identidade, String cpf, byte idade, float cr, String curso, int numeroDeDisciplinas)
    {
        alteraPessoa(nome, idade, telefone, endereco, cpf, identidade);
        setCr(cr);
        setCurso(curso);
        setNumeroDeDisciplinas(numeroDeDisciplinas);
    }
}
