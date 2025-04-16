package com.siac.domain.service;

import com.siac.domain.entites.Materia;
import com.siac.repository.MateriaRepository;

import java.util.List;

public class MateriaService {
    private final MateriaRepository materiaRepository;

    public MateriaService() {
        this.materiaRepository = new MateriaRepository();
    }

    public void cadastrarMateria(Materia materia) {
        materiaRepository.save(materia);
    }

    public List<Materia> getmaterias() {
        return materiaRepository.getAll();
    }

    public Materia getMateria(String codigoMateria) {
        return materiaRepository.findByCodigo(codigoMateria);
    }
}
