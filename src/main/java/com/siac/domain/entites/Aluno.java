package com.siac.domain.entites;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Integer matricula;
    private String nome;
    private String email;
    private Integer semestre;
    private List<Materia> materias;

    public Aluno(Integer matricula, String nome, String email, Integer semestre) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.semestre = semestre;
        this.materias = new ArrayList<>();
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Aluno: {" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", semestre=" + semestre +
                ", materias=" + materias +
                '}';
    }

}
