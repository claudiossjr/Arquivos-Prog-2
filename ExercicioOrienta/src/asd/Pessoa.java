package asd;

public class Pessoa {
    protected String nome,endereco,identidade,cpf,telefone;;
    protected byte idade; 

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11)
        {
            this.cpf = cpf;
        }
        else {
            System.out.println("Numero Invalido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        if(idade > 0 && idade < 130)
        {
        this.idade = idade;
        }
        else 
        {
            System.out.println("idade invalida");
        }
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        if (identidade.length() == 11)
        {    
        this.identidade = identidade;
        }
        else
        {
            System.out.println("identidade invalida");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.length() == 8)
        {
        this.telefone = telefone;
        }
        else
        {
            System.out.println("telefone invalido");
        }
    }
    
    public void alteraPessoa(String nome, byte idade, String telefone, String endereco, String cpf, String identidade)
    {
        setIdade(idade);
        setNome(nome);
        setTelefone(telefone);
        setEndereco(endereco);
        setIdentidade(identidade);
        setCpf(cpf);
    }
}
