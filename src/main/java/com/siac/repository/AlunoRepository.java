package com.siac.repository;

import com.siac.domain.entites.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos;

    public AlunoRepository() {
        this.alunos = new ArrayList<>();
    }

    public void save(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAll() {
        return alunos;
    }
}
