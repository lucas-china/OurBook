package br.ufpi.es.ourbook.visao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.ufpi.es.ourbook.dados.Usuario;

public class TelaPrincipal extends AppCompatActivity {

    private Usuario usuario = new Usuario();
    private Bundle bundleUsuario = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(br.ufpi.es.ourbook.R.layout.activity_tela_principal);

        //pega dados do usuario corrente da aplicacao
        Bundle dadosUsuario = getIntent().getExtras();
        if (dadosUsuario != null){
            usuario.setNome(dadosUsuario.getString("nomeUsuario"));
            usuario.setEmail(dadosUsuario.getString("emailUsuario"));
        }

        //carrega o bundle de Usuario para passar dados entre as Activities
        bundleUsuario.putString("nomeUsuario", usuario.getNome());
        bundleUsuario.putString("emailUsuario", usuario.getEmail());

    }

    public void verEstante(View view){

    }

    public void cadastarLivro(View view){

    }

    public void buscarLivro(View view){

    }

    public void configuracoes(View view){

    }

    public void sobre(View view){

    }
}
