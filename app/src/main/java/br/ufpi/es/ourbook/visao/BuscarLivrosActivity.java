package br.ufpi.es.ourbook.visao;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.controle.ControleLivro;
import br.ufpi.es.ourbook.modelo.LivrosBanco;

public class BuscarLivrosActivity extends AppCompatActivity {
    private ListView lista;
    private EditText titulo;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_livros);

        lista = (ListView) findViewById(R.id.listaLivros);

        titulo = (EditText) findViewById(R.id.titulo);

        botao = (Button) findViewById(R.id.bt_buscar);

    }

    public void pesquisaLivro(View view) {

            ControleLivro crud = new ControleLivro(getBaseContext());
            final Cursor cursor = crud.carregaDadoByTitulo(titulo.getText().toString());

            String[] nomeCampos = new String[]{LivrosBanco.ID, LivrosBanco.TITULO};
            int[] idViews = new int[]{R.id.idLivro, R.id.nomeLivro};

            SimpleCursorAdapter adaptador = new SimpleCursorAdapter(getBaseContext(),
                    R.layout.livros_lista, cursor, nomeCampos, idViews, 0);
            lista.setAdapter(adaptador);
    }
}
