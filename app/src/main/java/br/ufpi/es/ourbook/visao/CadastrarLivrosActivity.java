package br.ufpi.es.ourbook.visao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.controle.ControleLivro;

public class CadastrarLivrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_livros);

        Button botao = (Button)findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControleLivro crud = new ControleLivro(getBaseContext());
                EditText titulo = (EditText)findViewById(R.id.editText);
                EditText autor = (EditText)findViewById((R.id.editText2));
                EditText editora = (EditText)findViewById(R.id.editText3);
                EditText edicao = (EditText)findViewById(R.id.editText7);
                EditText genero = (EditText)findViewById(R.id.editText8);
                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String edicaoString = edicao.getText().toString();
                String generoString = genero.getText().toString();
                String resultado;

                resultado = crud.insereDado(tituloString,autorString,editoraString,edicaoString,generoString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}
