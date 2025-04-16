package com.siac.controllers;

import com.siac.domain.entites.Turma;
import com.siac.domain.service.TurmaService;
import java.util.List;
import java.util.Scanner;

public class TurmaController {
    private final TurmaService turmaService;

    public TurmaController() {
        this.turmaService = new TurmaService();
    }

    public void cadastrarTurma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua matricula: ");
        Integer codigo = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite seu nome completo: ");
        String codigoMateria = scanner.nextLine();

        Turma turma = turmaService.cadastrarTurma(codigo, codigoMateria);

        System.out.println("Turma cadastrada: " + turma);
    }

    public List<Turma> getTurmas() {
        return turmaService.getTurmas();
    }
}
