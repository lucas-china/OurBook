package br.ufpi.es.ourbook.visao;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.controle.ControleLivro;
import br.ufpi.es.ourbook.modelo.LivrosBanco;

public class AlteraLivrosActivity extends AppCompatActivity {

    EditText livro;
    EditText autor;
    EditText editora;
    Button alterar;
    Button deletar;
    Cursor cursor;
    ControleLivro crud;
    String codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altera_livros);

        codigo = this.getIntent().getStringExtra("codigo");

        crud = new ControleLivro(getBaseContext());

        livro = (EditText)findViewById(R.id.editText4);
        autor = (EditText)findViewById(R.id.editText5);
        editora = (EditText)findViewById(R.id.editText6);

        alterar = (Button)findViewById(R.id.button2);

        cursor = crud.carregaDadoById(Integer.parseInt(codigo));
        livro.setText(cursor.getString(cursor.getColumnIndexOrThrow(LivrosBanco.TITULO)));
        autor.setText(cursor.getString(cursor.getColumnIndexOrThrow(LivrosBanco.AUTOR)));
        editora.setText(cursor.getString(cursor.getColumnIndexOrThrow(LivrosBanco.EDITORA)));

    }
}
