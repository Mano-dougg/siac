package com.siac.domain.entites;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Integer codigo;
    private Materia materia;
    private List<Aluno> alunos;
    private Integer numeroDeAlunos;

    public Turma(Integer codigo, Materia materia) {
        this.codigo = codigo;
        this.materia = materia;
        this.alunos = new ArrayList<>();
        this.numeroDeAlunos = 0;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getNumeroDeAlunos() {
        return numeroDeAlunos;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Turma: {" +
                "codigo=" + codigo +
                ", materia=" + materia +
                ", alunos=" + alunos +
                ", numeroDeAlunos=" + numeroDeAlunos +
                '}';
    }
}
