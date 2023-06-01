package com.example.app_lista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_lista.R;
import com.example.app_lista.controller.PessoaController;
import com.example.app_lista.model.Pessoa;

public class MainActivity extends AppCompatActivity {
/*
    SharedPreferences preferences;

    SharedPreferences.Editor listaVip;*/

  //  public static final String NOME_PREFERENCES = "pref_listavip";

    Pessoa pessoa;
    Pessoa outraPessoa;

    PessoaController controller;

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

        controller = new PessoaController(MainActivity.this);
        controller.toString();

       /* preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();*/


        outraPessoa = new Pessoa();
        controller.buscar(outraPessoa);

        /*
        outraPessoa.setNome(preferences.getString("primeiroNome", ""));
        outraPessoa.setSobreNome(preferences.getString("sobreNome", ""));
        outraPessoa.setNomeCurso(preferences.getString("nomeCurso", ""));
        outraPessoa.setTelefone(preferences.getString("telefone", ""));*/

        editNome = findViewById(R.id.text_PrimeiroNome);
        editSobrenome = findViewById(R.id.text_Sobrenome);
        editNomeCurso = findViewById(R.id.text_NomeDoCurso);
        editTelefone = findViewById(R.id.text_TelefoneDeContato);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNome.setText(outraPessoa.getNome());
        editSobrenome.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getNomeCurso());
        editTelefone.setText(outraPessoa.getTelefone());

       btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefone.setText("");
        /*        listaVip.clear();
                listaVip.apply();*/
            }
        });

        btnbuton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Volte ", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnbuton_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                outraPessoa.setNome(editNome.getText().toString());
                outraPessoa.setSobreNome(editSobrenome.getText().toString());
                outraPessoa.setNomeCurso(editNomeCurso.getText().toString());
                outraPessoa.setTelefone(editTelefone.getText().toString());

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
                controller.salvar(outraPessoa);

               /* listaVip.putString("primeiroNome", outraPessoa.getNome());
                listaVip.putString("sobreNome", outraPessoa.getSobreNome());
                listaVip.putString("nomeCurso", outraPessoa.getNomeCurso());
                listaVip.putString("telefone", outraPessoa.getTelefone());
                listaVip.apply();*/

            }
        });

        Log.i("ProgramacaoPOO", outraPessoa.toString());

    }
}