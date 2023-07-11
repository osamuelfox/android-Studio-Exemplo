package com.example.app_lista.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.database.Lista_DB;
import com.example.app_lista.model.Pessoa;
import com.example.app_lista.model.Curso;
import com.example.app_lista.view.MainActivity;

public class PessoaController extends Lista_DB {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity activity){
        super(activity);

        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }

    public Pessoa salvar(Pessoa pessoa, Curso curso) {

        ContentValues dados = new ContentValues();

        Log.d("MVP_MVC_controller", "Salvo: " + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getNome());
        listaVip.putString("sobrenome", pessoa.getSobreNome());
        listaVip.putString("nomeCurso", pessoa.getNomeCurso());
        listaVip.putString("telefone", pessoa.getTelefone());
        listaVip.putString("categoria", curso.getCursoDesejado());
        listaVip.apply();

        dados.put("primeiroNome",pessoa.getNome());
        dados.put("sobrenome", pessoa.getSobreNome());
        dados.put("nomeCurso", pessoa.getNomeCurso());
        dados.put("telefone", pessoa.getTelefone());
        dados.put("categoria", curso.getCursoDesejado());

        salvarObjeto("Curso", dados);

        return pessoa;
    }


    public Pessoa buscar(Pessoa outraPessoa){
        outraPessoa.setNome(preferences.getString("primeiroNome", ""));
        outraPessoa.setSobreNome(preferences.getString("sobrenome", ""));
        outraPessoa.setNomeCurso(preferences.getString("nomeCurso", ""));
        outraPessoa.setTelefone(preferences.getString("telefone", ""));
        return outraPessoa;
    }

    public void limpar (){
        listaVip.clear();
        listaVip.apply();

    }
}