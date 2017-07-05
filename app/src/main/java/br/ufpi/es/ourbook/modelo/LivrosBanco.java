package br.ufpi.es.ourbook.modelo;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by marci on 05/07/2017.
 */

public class LivrosBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "livros";
    public static final String ID = "_id";
    public static final String TITULO = "titulo";
    public static final String AUTOR = "autor";
    public static final String EDITORA = "editora";
    public static final String GENERO =  "genero";
    public static final String EDICAO = "edicao";
    public  static final String DISPONIVEL = "disponivel";
    private static final int VERSAO = 1;

    public LivrosBanco(Context context) {
        super(context, NOME_BANCO,null,VERSAO);

    }

    public LivrosBanco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public LivrosBanco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABELA + " ("
                + ID + " integer primary key autoincrement, "
                + TITULO + " text, "
                + AUTOR + " text, "
                + EDITORA + " text, "
                + GENERO + " text, "
                + EDICAO + " text, "
                + DISPONIVEL + " text"
                + ");";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }


}
