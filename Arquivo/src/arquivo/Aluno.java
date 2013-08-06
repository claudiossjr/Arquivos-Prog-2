package arquivo;

public class Aluno {
    protected String nome;
     protected int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
