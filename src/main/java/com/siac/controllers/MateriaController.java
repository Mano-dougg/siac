package com.siac.controllers;

import com.siac.domain.entites.Aluno;
import com.siac.domain.entites.Materia;
import com.siac.domain.service.MateriaService;

import java.util.List;
import java.util.Scanner;

public class MateriaController {
    private final MateriaService materiaService;

    public MateriaController() {
        this.materiaService = new MateriaService();
    }

    public void cadastrarMateria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua matricula: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu semestre: ");
        Integer horas = Integer.parseInt(scanner.nextLine());

        Materia materia = new Materia(codigo, horas, nome);

        materiaService.cadastrarMateria(materia);

        System.out.println("Matéria cadastrada: " + materia);
    }

    public List<Materia> getmaterias() {
        return materiaService.getmaterias();
    }
}
