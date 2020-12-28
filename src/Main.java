import java.util.ArrayList;
import io.ramontjunior.alba.model.*;


public class Main {
    public static void main(String[] args) throws Exception {
                
        User user = new User();
        user.setNome("Ramont Junior");
        System.out.println(user.hashCode());

        ArrayList<Livro> livros = new ArrayList<Livro>();

        Estante estante = new Estante();
        estante.setLivros(livros);

        Livro livro = new Livro();
        livro.setIsbn(1000);
        livro.setNome("Livro 001");

        livros.add(livro);

        Livro livro2 = new Livro();
        livro2.setIsbn(1000);
        livro2.setNome("Livro 002");

        livros.add(livro2);

        System.out.println(estante.getLivros());

    }
}
