package com.example.app_lista.controller;

import android.content.SharedPreferences;
import android.util.Log;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.example.app_lista.model.Pessoa;
import com.example.app_lista.view.MainActivity;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_controller", "Controller Iniciado");
        return super.toString();
    }

    public void salvar(Pessoa outraPessoa) {

        Log.d("MVP_MVC_controller", "Salvo: " + outraPessoa.toString());
    }


    SharedPreferences preferences;

    SharedPreferences.Editor listaVip;

    public static final String NOME_PREFERENCES = "pref_listavip";

    public void main (MainActivity mainActivity){

        EditText editNome;
        EditText editSobrenome;
        EditText editNomeCurso;
        EditText editTelefone;

    }

    private void limpar(SharedPreferences preferences){

        listaVip.clear();
        listaVip.apply();

    }

    private void salvar(SharedPreferences preferences){

    }

    private void finalizar(SharedPreferences preferences){

    }


























}