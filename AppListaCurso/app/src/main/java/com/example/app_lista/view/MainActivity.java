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
        controller = new PessoaController();
        controller.toString();

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

        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefone.setText("");
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
                outraPessoa.setNome(editSobrenome.getText().toString());
                outraPessoa.setNome(editNomeCurso.getText().toString());
                outraPessoa.setNome(editTelefone.getText().toString());

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
                controller.salvar(outraPessoa);


            }
        });

        Log.i("ProgramacaoPOO", pessoa.toString());
        Log.i("ProgramacaoPOO", outraPessoa.toString());

    }
}