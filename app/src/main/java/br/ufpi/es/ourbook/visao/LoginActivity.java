package br.ufpi.es.ourbook.visao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.ufpi.es.ourbook.R;
import br.ufpi.es.ourbook.controle.ControleUsuario;
import br.ufpi.es.ourbook.dados.Usuario;

public class LoginActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.editTexEmail);
        senha = (EditText) findViewById(R.id.editTextSenha);
    }

    public void login(View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        try{
            Usuario usuario = new ControleUsuario().carregarUsuario(usuarioInformado);

            if(usuario != null){
                if (usuarioInformado.equals(usuario.getEmail()) && senhaInformada.equals(usuario.getSenha())){
                    //Bundle budle = new Bundle();
                    //budle.putString("nomeUsuario",usuario.getNome());
                    //budle.putString("emailUsuario",usuario.getEmail());

                    Intent intent = new Intent(this, TelaPrincipal.class);
                    intent.putExtra("usuario",usuario);
                    limpaCamposEntrada();
                    startActivity(intent);
                }
                else {
                    String msgErro = "Erro de autenticação";
                    Toast toast = Toast.makeText(this,msgErro,Toast.LENGTH_LONG);
                    toast.show();
                    limpaCamposEntrada();
                }
            }

        } catch (Exception ex){
            Toast toast = Toast.makeText(this,ex.getMessage(), Toast.LENGTH_LONG);
            toast.show();
            limpaCamposEntrada();
        }
    }

    public void esqueciSenha(View view){
        String mensagem = "Método não implementado";
        Toast toast = Toast.makeText(this, mensagem, Toast.LENGTH_LONG);
        toast.show();
    }

    public void limpaCamposEntrada(){
        usuario.setText("");
        senha.setText("");
    }
}
