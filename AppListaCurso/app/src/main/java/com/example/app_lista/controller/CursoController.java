package com.example.app_lista.controller;

import com.example.app_lista.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoController {

//    private List<String> cursos = new ArrayList<>(
//            Arrays.asList("Desenvolvimento ", "Enfermagem", "Moda", "Odonto", "Administracao", "Informatica", "Estetica"));
//
//    public List<String> getCursos() {
//        return cursos;
//    }
//
//    public void setCursos(List<String> cursos) {
//        this.cursos = cursos;
//    }

    private List listaCurso;
    public List getListaCurso(){

        listaCurso = new ArrayList<Curso>();

        listaCurso.add(new Curso("Informatica"));
        listaCurso.add(new Curso("Desenvolvimento"));
        listaCurso.add(new Curso("Enfermagem"));
        listaCurso.add(new Curso("Administracao"));
        listaCurso.add(new Curso("Moda"));
        listaCurso.add(new Curso("Culinaria"));
        listaCurso.add(new Curso("Catira"));
        listaCurso.add(new Curso("Jogo do Bicho"));

        return listaCurso;
    }

    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getListaCurso().size();i++ ){
            Curso objeto = (Curso) getListaCurso().get(i);
            dados.add(objeto.getCursoDesejado());

        }
        return dados;
    }
}
