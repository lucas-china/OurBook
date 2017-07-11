package br.ufpi.es.ourbook.controle;

import java.util.List;

import br.ufpi.es.ourbook.dados.Livro;
import br.ufpi.es.ourbook.dados.Usuario;

/**
 * Created by Lucas Brito on 23/06/2017.
 */

public class ControleUsuario {

    public Usuario carregarUsuario(String email){
        Usuario usuario = new Usuario();
        List<Livro> livros;

        if (email.equals("lucasbrito@gmail.com")){
            usuario.setEmail("lucasbrito@gmail.com");
            usuario.setNome("Lucas Santana Brito");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("1234");
            usuario.setSexo("Masculino");
            //new ControleLivro().startaLivros(usuario);
        }
        else if (email.equals("luciaemilia@gmail.com")){
            usuario.setEmail("luciaemilia@gmail.com");
            usuario.setNome("Lucia Emilia");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("456");
            usuario.setSexo("Femenino");
           // new ControleLivro().startaLivros(usuario);
        }
        else if (email.equals("paulaandrade@gmail.com")){
            usuario.setEmail("paulaandrade@gmail.com");
            usuario.setNome("Paula Andrade");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("567");
            usuario.setSexo("femenino");
           // new ControleLivro().startaLivros(usuario);
        }
        else if (email.equals("marcio@gmail.com")){
            usuario.setEmail("marcio@gmail.com");
            usuario.setNome("Marcio");
            usuario.setEndereco("Rua blá blá blá");
            usuario.setSenha("789");
            usuario.setSexo("Masculino");
           // new ControleLivro().startaLivros(usuario);
        }
        else{
            String msg = "Usuário não existe !";
            System.out.println(msg);
        }


        return usuario;
    }
}
