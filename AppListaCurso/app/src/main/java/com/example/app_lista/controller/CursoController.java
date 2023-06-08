package com.example.app_lista.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CursoController {

    private List<String> cursos = new ArrayList<>(
            Arrays.asList("Tecnico", "Faculdade", "OAB"));

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }
}
