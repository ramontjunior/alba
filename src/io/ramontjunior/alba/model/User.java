package io.ramontjunior.alba.model;

public class User {
   private int id;
   private String nome;
   private String usuario;
   private String senha;
   private String email;

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

   public String getUsuario() {
      return this.usuario;
   }
   public void setUsuario(String usuario) {
      this.usuario = usuario;
   }

   public String getSenha() {
      return this.senha;
   }
   public void setSenha(String senha) {
      this.senha = senha;
   }

   public String getEmail() {
      return this.email;
   }
   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "{" +
         " id='" + getId() + "'" +
         ", nome='" + getNome() + "'" +
         ", usuario='" + getUsuario() + "'" +
         ", senha='" + getSenha() + "'" +
         ", email='" + getEmail() + "'" +
         "}";
   }

   public User(){}

   public User(int id, String nome, String usuario, String senha, String email) {
      this.id = id;
      this.nome = nome;
      this.usuario = usuario;
      this.senha = senha;
      this.email = email;
   }
   
}
