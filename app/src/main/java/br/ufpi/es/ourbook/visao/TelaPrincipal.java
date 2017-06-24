package br.ufpi.es.ourbook.visao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    private TextView textViewNome, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(br.ufpi.es.ourbook.R.layout.activity_tela_principal);

        textViewNome = (TextView) findViewById(br.ufpi.es.ourbook.R.id.textViewNome);
        textViewEmail = (TextView) findViewById(br.ufpi.es.ourbook.R.id.textViewEmail);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nome = bundle.getString("nomeUsuario");
        String email = bundle.getString("emailUsuario");

        textViewNome.setText("Nome: " + nome);
        textViewEmail.setText("Email: " + email);

    }
}
