package com.example.agendamobile.dao;

import com.example.agendamobile.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final static List<Aluno> listaAlunos = new ArrayList<>();
    public void salva(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<Aluno>(listaAlunos);
    }
}
