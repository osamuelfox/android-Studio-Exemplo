package com.example.app_lista.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.app_lista.model.Pessoa;

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


}
