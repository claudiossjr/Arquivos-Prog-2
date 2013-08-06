/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Obejeto;

import java.io.Serializable;

/**
 *
 * @author tc claudio
 */
public class AlunoSerializado implements Serializable{
    protected int matricula;
    protected String nome;
    protected int idade;

    public AlunoSerializado(){
        
    }
    
    public AlunoSerializado(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
