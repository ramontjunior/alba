import java.util.ArrayList;

import io.ramontjunior.alba.model.*;

public class Main2 {
   public static void main(String[] args) {
        

      Livro livro = new Livro();
      livro.setIsbn(004433);
      livro.setDescricao("descricao001");
      livro.setEstrelas(5);

      ArrayList<Livro> livros = new ArrayList<>();

      Estante estante = new Estante();
      estante.setNome("Estante 01");
      estante.setLivros(livros);

      estante.adcLivro(livro);

      System.out.println(estante.getLivros());

   }
}
