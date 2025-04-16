package com.siac.domain.service;

import com.siac.domain.entites.Aluno;
import com.siac.repository.AlunoRepository;

import java.util.List;

public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService() {
        this.alunoRepository = new AlunoRepository();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunoRepository.getAll();
    }
}
