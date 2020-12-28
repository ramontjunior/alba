package io.ramontjunior.alba.model;

public class Livro {
    
    private int isbn;
    private int anoPublicado;
    private int estrelas;           //Quantidade de estrelas o livro tem
    private int edicao;             //volume
    private String nome;            //Nome do livro
    private String descricao;       //Resumo do livro
    
    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAnoPublicado() {
        return this.anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public int getEstrelas() {
        return this.estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "{" +
            " isbn='" + isbn + "'" +
            ", anoPublicado='" + anoPublicado + "'" +
            ", estrelas='" + estrelas + "'" +
            ", edicao='" + edicao + "'" +
            ", nome='" + nome + "'" +
            ", descricao='" + descricao + "'" +
            "}";
    }
    
}
