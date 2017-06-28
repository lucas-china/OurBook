package br.ufpi.es.ourbook.controle;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.es.ourbook.dados.Livro;
import br.ufpi.es.ourbook.dados.Usuario;

/**
 * Created by Lucas Brito on 25/06/2017 _.
 */

public class ControleLivro {

    private List<Livro> livros = new ArrayList<>();



    public void cadastrarLivro(Livro livro, Usuario usuario){
        usuario.adicionarLivro(livro);
    }

    public List<Livro> listarLivros(Usuario usuario){
        return usuario.getLivros();
    }

    public void startaLivros(Usuario usuario){
        Livro livro1, livro2, livro3;

        if (usuario.getEmail().equals("lucasbrito@gmail.com")){
            livro1 = new Livro("Harry Potter", "J. K. Rowling", "Infantojuvenil");
            livro2 = new Livro("Senhor dos Aneis", "J. R. R. Tolkien", "Literatura Fantastica");
            livro3 = new Livro("As Cronicas de Gelo e Fogo", "George R. R. Martin", "Fantasia Epica");

            livros.add(livro1);
            livros.add(livro2);
            livros.add(livro3);

        } else if (usuario.getEmail().equals("luciaemilia@gmail.com")) {
            livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance Brasileiro");
            livro2 = new Livro("P.S Eu te Amo", "Cecelia Ahern", "Romance");
            livro3 = new Livro("Depois daquela Viagem", "Valéria Piassa Polizzi", "Drama");

            livros.add(livro1);
            livros.add(livro2);
            livros.add(livro3);

        } else if (usuario.getEmail().equals("paulaandrade@gmail.com")) {
            livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance Brasileiro");
            livro2 = new Livro("P.S Eu te Amo", "Cecelia Ahern", "Romance");
            livro3 = new Livro("Depois daquela Viagem", "Valéria Piassa Polizzi", "Drama");

            livros.add(livro1);
            livros.add(livro2);
            livros.add(livro3);

        } else if (usuario.getEmail().equals("marcio@gmail.com")) {
            livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance Brasileiro");
            livro2 = new Livro("P.S Eu te Amo", "Cecelia Ahern", "Romance");
            livro3 = new Livro("Depois daquela Viagem", "Valéria Piassa Polizzi", "Drama");

            livros.add(livro1);
            livros.add(livro2);
            livros.add(livro3);
        }
        else{
            System.out.println("Usuario não existe");
        }

        usuario.setLivros(livros);
    }

}
