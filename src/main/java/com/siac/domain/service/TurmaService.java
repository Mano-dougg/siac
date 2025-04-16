package com.siac.domain.service;

import com.siac.domain.entites.Materia;
import com.siac.domain.entites.Turma;
import com.siac.repository.TurmaRepository;

import java.util.List;

public class TurmaService {
    private final TurmaRepository turmaRepository;
    private final MateriaService materiaService;

    public TurmaService() {
        this.turmaRepository = new TurmaRepository();
        this.materiaService = new MateriaService();
    }

    public Turma cadastrarTurma(Integer codigo, String codigoDaMateria) {
        Materia materia = materiaService.getMateria(codigoDaMateria);

        Turma turma = new Turma(codigo, materia);

        turmaRepository.save(turma);

        return turma;
    }

    public List<Turma> getTurmas() {
        return turmaRepository.getAll();
    }
}
