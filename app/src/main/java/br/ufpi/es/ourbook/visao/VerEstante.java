package br.ufpi.es.ourbook.visao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.controle.ControleLivro;
import br.ufpi.es.ourbook.controle.ControleUsuario;
import br.ufpi.es.ourbook.dados.Livro;
import br.ufpi.es.ourbook.dados.Usuario;

public class VerEstante extends AppCompatActivity {


    Usuario usuario = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_estante);

        ListView listView = (ListView) findViewById(R.id.listView);

        usuario = (Usuario) getIntent().getSerializableExtra("usuario");

        this.listarLivros(listView);

    }

    public void listarLivros(ListView listView){
        List<Livro> livros = new ControleLivro().listarLivros(usuario);
        if(livros != null){
            ArrayAdapter<Livro> adapter = new ArrayAdapter<Livro>(this,android.R.layout.simple_list_item_1,livros);

            listView.setAdapter(adapter);
        }

    }
}
