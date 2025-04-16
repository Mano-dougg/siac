package com.siac.repository;

import com.siac.domain.entites.Turma;

import java.util.ArrayList;
import java.util.List;

public class TurmaRepository {
    private List<Turma> turmas;

    public TurmaRepository() {
        this.turmas = new ArrayList<>();
    }

    public void save(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> getAll() {
        return turmas;
    }
}
