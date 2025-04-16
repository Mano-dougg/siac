package com.siac.controllers;

import com.siac.domain.entites.Aluno;
import com.siac.domain.service.AlunoService;

import java.util.List;
import java.util.Scanner;

public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController() {
        this.alunoService = new AlunoService();
    }

    public void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua matricula: ");
        Integer matricula = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite seu semestre: ");
        Integer semestre = Integer.parseInt(scanner.nextLine());

        Aluno aluno = new Aluno(matricula, nome, email, semestre);

        alunoService.cadastrarAluno(aluno);

        System.out.println("Aluno cadastrado: " + aluno);
    }

    public void getAlunos() {
        List<Aluno> alunos = alunoService.getAlunos();

        for (Aluno aluno: alunos) {
            System.out.println(aluno);
        }
    }
}
