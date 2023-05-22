package com.example.app_lista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.app_lista.R;
import com.example.app_lista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutaPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setNome("Samuel");
        pessoa.setSobreNome("Santos");
        pessoa.setNomeCurso("Tecnico");
        pessoa.setTelefone(34-984422478);

        outraPessoa = new Pessoa();
        outraPessoa.setNome("Ana");
        outraPessoa.setSobreNome("Santos");
        outraPessoa.setNomeCurso("Estatica");
        outraPessoa.setTelefone(34-934534454);
/*
        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Nome do curso: ";
        dadosPessoa += pessoa.getNomeCurso();
        dadosPessoa += "Telefone: ";
        dadosPessoa += pessoa.getTelefone();*/

        dadosOutaPessoa = "Primeiro nome: ";
        dadosOutaPessoa += outraPessoa.getNome();
        dadosOutaPessoa += "Sobrenome: ";
        dadosOutaPessoa += outraPessoa.getNome();
        dadosOutaPessoa += "Nome do curso: ";
        dadosOutaPessoa += outraPessoa.getNomeCurso();
        dadosOutaPessoa += "Telefone: ";
        dadosOutaPessoa += outraPessoa.getTelefone();

        Log.i("ProgramacaoPOO", pessoa.toString());
        Log.i("ProgramacaoPOO", outraPessoa.toString());













    }
}