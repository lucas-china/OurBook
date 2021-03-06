package br.ufpi.es.ourbook.dados;

import java.io.Serializable;

/**
 * Created by Lucas Brito on 25/06/2017.
 */

public class Livro  implements Serializable{

    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String genero;
    private int edicao;
    private boolean disponivel;

    public Livro(String titulo, String autor, String genero){

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "\n"+
                "Autor: " + autor + "\n"+
                "Genero: " + genero + "\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
