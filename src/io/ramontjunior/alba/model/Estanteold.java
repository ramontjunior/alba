package io.ramontjunior.alba.model;

import java.util.ArrayList;

public class Estanteold {
    private int id;
    private String nome;
    int ativa;
    ArrayList<Livro> livros;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtiva() {
        return this.ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", nome='" + nome + "'" +
            ", ativa='" + ativa + "'" +
            ", livros='" + livros + "'" +
            "}";
    }

}
