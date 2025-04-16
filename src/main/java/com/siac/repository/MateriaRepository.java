package com.siac.repository;

import com.siac.domain.entites.Materia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MateriaRepository {
    List<Materia> materias;

    public MateriaRepository () {
        this.materias = new ArrayList<>();
    }

    public void save(Materia materia) {
        materias.add(materia);
    }

    public List<Materia> getAll() {
        return materias;
    }

    public Materia findByCodigo(String codigo) {
        for (Materia materia : materias) {
            if (Objects.equals(codigo, materia.getCodigo())) {
                return materia;
            }
        }

        return null;
    }
}
