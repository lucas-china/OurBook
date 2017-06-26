package br.ufpi.es.ourbook.controle;

import br.ufpi.es.ourbook.dados.Livro;
import br.ufpi.es.ourbook.dados.Usuario;

/**
 * Created by Lucas Brito on 25/06/2017.
 */

public class ControleLivro {
    private Livro[] livros = new Livro[3];

    public Livro[] listarLivros(String email){

        if (email.equals("lucasbrito@gmail.com")){
            Livro livro1 = new Livro("Harry Potter", "J. K. Rowling", "Infantojuvenil");
            Livro livro2 = new Livro("Senhor dos Aneis", "J. R. R. Tolkien", "Literatura Fantastica");
            Livro livro3 = new Livro("As Cronicas de Gelo e Fogo", "George R. R. Martin", "Fantasia Epica");

            livros[0] = livro1;
            livros[1] = livro2;
            livros[2] = livro3;


        } else if (email.equals("luciaemilia@gmail.com")) {
            Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance Brasileiro");
            Livro livro2 = new Livro("P.S Eu te Amo", "Cecelia Ahern", "Romance");
            Livro livro3 = new Livro("Depois daquela Viagem", "Valéria Piassa Polizzi", "Drama");

            livros[0] = livro1;
            livros[1] = livro2;
            livros[2] = livro3;

        } else if (email.equals("paulaandrade@gmail.com")) {
            Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance Brasileiro");
            Livro livro2 = new Livro("P.S Eu te Amo", "Cecelia Ahern", "Romance");
            Livro livro3 = new Livro("Depois daquela Viagem", "Valéria Piassa Polizzi", "Drama");

            livros[0] = livro1;
            livros[1] = livro2;
            livros[2] = livro3;

        } else if (email.equals("marcio@gmail.com")) {
            Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Romance Brasileiro");
            Livro livro2 = new Livro("P.S Eu te Amo", "Cecelia Ahern", "Romance");
            Livro livro3 = new Livro("Depois daquela Viagem", "Valéria Piassa Polizzi", "Drama");

            livros[0] = livro1;
            livros[1] = livro2;
            livros[2] = livro3;
        }
        else{
            System.out.println("Usuario não existe");
        }

        return livros;
    }

}
