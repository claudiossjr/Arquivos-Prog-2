package ProcessamentoDePrograma;

public class Aluno {
    protected String nome;
    protected String matricula;
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public Aluno () {
        this.nome = "";
        this.matricula = "";
    }
}
