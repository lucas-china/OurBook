package br.ufpi.es.ourbook.controle;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.ufpi.es.ourbook.dados.Livro;
import br.ufpi.es.ourbook.dados.Usuario;
import br.ufpi.es.ourbook.modelo.LivrosBanco;

/**
 * Created by Lucas Brito on 25/06/2017.
 */

public class ControleLivro {

    private SQLiteDatabase db;
    private LivrosBanco banco;

    public ControleLivro(Context context){
        banco = new LivrosBanco(context);
    }

    public String insereDado(String titulo, String autor, String editora, String edicao,String genero){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(LivrosBanco.TITULO, titulo);
        valores.put(LivrosBanco.AUTOR, autor);
        valores.put(LivrosBanco.EDITORA, editora);
/*        valores.put(LivrosBanco.GENERO, genero);
        valores.put(LivrosBanco.EDICAO, edicao);
        valores.put(LivrosBanco.DISPONIVEL, "1");*/


        resultado = db.insert(LivrosBanco.TABELA, null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";

    }

    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {banco.ID,banco.TITULO};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public Cursor carregaDadoById(int id){
        Cursor cursor;
        String[] campos =  {banco.ID,banco.TITULO,banco.AUTOR,banco.EDITORA};
        String where = LivrosBanco.ID + "=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query(LivrosBanco.TABELA,campos,where, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public void alteraRegistro(int id, String titulo, String autor, String editora){
        ContentValues valores;
        String where;

        db = banco.getWritableDatabase();

        where = LivrosBanco.ID + "=" + id;

        valores = new ContentValues();
        valores.put(LivrosBanco.TITULO, titulo);
        valores.put(LivrosBanco.AUTOR, autor);
        valores.put(LivrosBanco.EDITORA, editora);

        db.update(LivrosBanco.TABELA,valores,where,null);
        db.close();
    }
}

/*public class ControleLivro {

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

}*/

