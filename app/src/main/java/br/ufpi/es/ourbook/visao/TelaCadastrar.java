package br.ufpi.es.ourbook.visao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.dados.Livro;

public class TelaCadastrar extends AppCompatActivity {

    private EditText Titulo;
    private EditText Autor;
    private EditText Editora;
    private EditText Genero;
    private EditText Edicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrar);

        Titulo = (EditText)findViewById(R.id.etTitulo);
        Autor = (EditText)findViewById(R.id.etAutor);
        Editora = (EditText)findViewById(R.id.etEditora);
        Genero = (EditText)findViewById(R.id.etGenero);
        Edicao = (EditText)findViewById(R.id.etEdicao);

        Titulo.requestFocus();
    }

    public void cadastarLivro(View view){
        String tituloLivro = Titulo.getText().toString();
        String autorLivro = Autor.getText().toString();;
        String editoraLivro = Editora.getText().toString();;
        String generoLivro = Genero.getText().toString();;
        int edicaoLivro = Integer.parseInt(Edicao.getText().toString());

        Livro novoLivro = new Livro(tituloLivro, autorLivro, generoLivro);

        novoLivro.setEdicao(edicaoLivro);
        novoLivro.setEditora(editoraLivro);
        novoLivro.setDisponivel(true);

        String msg = "Livro Adicionado com Sucesso";
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        toast.show();

        Titulo.setText("");
        Autor.setText("");
        Editora.setText("");
        Genero.setText("");
        Edicao.setText("");

        Titulo.requestFocus();
    }

    public void cancelar(View view){
        finish();
    }
}
