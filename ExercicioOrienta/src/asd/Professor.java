package asd;

public class Professor extends Pessoa {
    private String siape, instituto, linhaDePesquisa;

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getLinaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        if(siape.length() == 9)
        {
        this.siape = siape;
        }
        else
        {
            System.out.println("SIAPE invalido");
        }    
    }
    
    public void alteraProfessor(String nome, byte idade, String telefone, String endereco, String cpf, String identidade, String siape, String instituto, String linhaDePesquisa)
    {
        alteraPessoa(nome, idade, telefone, endereco, cpf, identidade);
        setSiape(siape);
        setInstituto(instituto);
        setLinhaDePesquisa(linhaDePesquisa);
    }
    
}
