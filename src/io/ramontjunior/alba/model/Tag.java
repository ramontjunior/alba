package io.ramontjunior.alba.model;

public class Tag {
        
    private int id;
    private int ativo;              //Validar se o autor ainda está "cadastrado" no sistema
    private String nome;            //Nome da tag

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtivo() {
        return this.ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", ativo='" + getAtivo() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }

}