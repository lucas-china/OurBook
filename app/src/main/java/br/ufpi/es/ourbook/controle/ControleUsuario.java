package br.ufpi.es.ourbook.controle;

import br.ufpi.es.ourbook.dados.Livro;
import br.ufpi.es.ourbook.dados.Usuario;
import br.ufpi.es.ourbook.controle.ControleLivro;

/**
 * Created by Lucas Brito on 23/06/2017.
 */

public class ControleUsuario {

    public Usuario carregarUsuario(String email){
        Usuario usuario = new Usuario();
        Livro[] livros;

        if (email.equals("lucasbrito@gmail.com")){
            usuario.setEmail("lucasbrito@gmail.com");
            usuario.setNome("Lucas Santana Brito");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("1234");
            usuario.setSexo("Masculino");
            usuario.setLivros(livros = new ControleLivro().listarLivros("lucasbrito@gmail.com"));
        }
        else if (email.equals("luciaemilia@gmail.com")){
            usuario.setEmail("luciaemilia@gmail.com");
            usuario.setNome("Lucia Emilia");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("456");
            usuario.setSexo("Femenino");
            usuario.setLivros(livros = new ControleLivro().listarLivros("luciaemilia@gmail.com"));
        }
        else if (email.equals("paulaandrade@gmail.com")){
            usuario.setEmail("paulaandrade@gmail.com");
            usuario.setNome("Paula Andrade");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("567");
            usuario.setSexo("femenino");
            usuario.setLivros(livros = new ControleLivro().listarLivros("paulaandrade@gmail.com"));
        }
        else if (email.equals("marcio@gmail.com")){
            usuario.setEmail("marcio@gmail.com");
            usuario.setNome("Marcio");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("789");
            usuario.setSexo("Masculino");
            usuario.setLivros(livros = new ControleLivro().listarLivros("marcio@gmail.com"));
        }
        else{
            String msg = "Usuário não existe !";
            System.out.println(msg);
        }


        return usuario;
    }
}
