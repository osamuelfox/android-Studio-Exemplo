package com.example.app_lista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.example.app_lista.R;
import com.example.app_lista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutaPessoa;

    EditText editNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefone;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setNome("Samuel");
        pessoa.setSobreNome("Santos");
        pessoa.setNomeCurso("Tecnico");
        pessoa.setTelefone("4422478");

        outraPessoa = new Pessoa();
        outraPessoa.setNome("Ana");
        outraPessoa.setSobreNome("Santos");
        outraPessoa.setNomeCurso("Estatica");
        outraPessoa.setTelefone("4534454");

        editNome = findViewById(R.id.text_PrimeiroNome);
        editSobrenome = findViewById(R.id.text_Sobrenome);
        editNomeCurso = findViewById(R.id.text_NomeDoCurso);
        editTelefone = findViewById(R.id.text_TelefoneDeContato);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNome.setText(pessoa.getNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getNomeCurso());
        editTelefone.setText(pessoa.getTelefone());
/*
        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Nome do curso: ";
        dadosPessoa += pessoa.getNomeCurso();
        dadosPessoa += "Telefone: ";
        dadosPessoa += pessoa.getTelefone();*/

        /*dadosOutaPessoa = "Primeiro nome: ";
        dadosOutaPessoa += outraPessoa.getNome();
        dadosOutaPessoa += "Sobrenome: ";
        dadosOutaPessoa += outraPessoa.getNome();
        dadosOutaPessoa += "Nome do curso: ";
        dadosOutaPessoa += outraPessoa.getNomeCurso();
        dadosOutaPessoa += "Telefone: ";
        dadosOutaPessoa += outraPessoa.getTelefone();*/

        Log.i("ProgramacaoPOO", pessoa.toString());
        Log.i("ProgramacaoPOO", outraPessoa.toString());













    }
}