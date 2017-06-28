package br.ufpi.es.ourbook.dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas Brito on 22/06/2017 _.
 */

public class Usuario implements Serializable{

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String sexo;
    private String endereco;
    private List<Livro> livros = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
