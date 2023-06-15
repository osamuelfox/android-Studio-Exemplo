package com.example.app_lista.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_lista.R;
import com.example.app_lista.controller.CursoController;
import com.example.app_lista.controller.PessoaController;
import com.example.app_lista.model.Pessoa;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;
    List<String> nomesDoCurso;

    PessoaController controller;
    CursoController cursoController;

    EditText editNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefone;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cursoController = new CursoController();

        nomesDoCurso = cursoController.dadosSpinner();

        cursoController.getListaCurso();
//
//        Spinner listaDeCursos = findViewById(R.id.ListaSpinner);
//        listaDeCursos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cursoController.getCursos()));

        controller = new PessoaController(MainActivity.this);
        controller.toString();

        outraPessoa = new Pessoa();
        controller.buscar(outraPessoa);

        editNome = findViewById(R.id.text_PrimeiroNome);
        editSobrenome = findViewById(R.id.text_Sobrenome);
        editNomeCurso = findViewById(R.id.text_NomeDoCurso);
        editTelefone = findViewById(R.id.text_TelefoneDeContato);

        spinner = findViewById(R.id.ListaSpinner);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNome.setText(outraPessoa.getNome());
        editSobrenome.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getNomeCurso());
        editTelefone.setText(outraPessoa.getTelefone());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        cursoController.dadosSpinner();

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);

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
                outraPessoa.setSobreNome(editSobrenome.getText().toString());
                outraPessoa.setNomeCurso(editNomeCurso.getText().toString());
                outraPessoa.setTelefone(editTelefone.getText().toString());

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
                controller.salvar(outraPessoa);

            }
        });

        Log.i("ProgramacaoPOO", outraPessoa.toString());

    }
}