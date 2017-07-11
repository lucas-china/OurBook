package br.ufpi.es.ourbook.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.dados.Usuario;

public class TelaPrincipal extends AppCompatActivity {

    private Usuario usuario = new Usuario();
    //private Bundle bundleUsuario = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(br.ufpi.es.ourbook.R.layout.activity_tela_principal);

        //pega dados do usuario corrente da aplicacao e criando o usuario
        usuario = (Usuario) getIntent().getSerializableExtra("usuario");


        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Olá, " + usuario.getNome().toString());

    }

    @Override
    public void onBackPressed(){
        String msg = "Usuário " + usuario.getNome().toString() + " já está logado !";
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void verEstante(View view){
        // chama a tela ver estante
        Intent intentVerEstante = new Intent(this,ListarLivrosActivity.class);
        intentVerEstante.putExtra("usuario",usuario);
        startActivity(intentVerEstante);
    }

    public void cadastarLivro(View view){
        // chama a tela cadastar livro
        Intent intentCadastarLivro = new Intent(this,CadastrarLivrosActivity.class);
        intentCadastarLivro.putExtra("usuario",usuario);
        startActivity(intentCadastarLivro);
    }

    public void buscarLivro(View view){
        // chama a tela cadastar livro
        Intent intentBuscarLivro = new Intent(this,BuscarLivrosActivity.class);
        intentBuscarLivro.putExtra("usuario",usuario);
        startActivity(intentBuscarLivro);
}

    public void logout(View view){
        finish();
    }

    public void sobre(View view){

    }
}
