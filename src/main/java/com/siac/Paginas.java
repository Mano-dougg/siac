package com.siac;

import com.siac.controllers.AlunoController;
import com.siac.controllers.MateriaController;
import com.siac.controllers.TurmaController;

import java.util.Scanner;

public class Paginas {
    public static void paginaInicial() {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastra pessoas");
            System.out.println("Opção 2 - Imprime pessoas cadastradas");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");
            System.out.print("Digite sua opção aqui: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    paginaCadastro();
                    break;

                case 2:
                    paginaConsulta();
                    break;
            }
        }
        while (opcao != 0);

    }

    public static void paginaCadastro() {
        AlunoController alunoController = new AlunoController();
        MateriaController materiaController = new MateriaController();
        TurmaController turmaController = new TurmaController();

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastrar aluno");
            System.out.println("Opção 2 - Cadastrar matéria");
            System.out.println("Opção 3 - Cadastrar turma");
            System.out.println("Opção 4 - Voltar para a página inicial");
            System.out.println("_______________________");
            System.out.print("Digite sua opção aqui: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    alunoController.cadastrarAluno();
                    break;

                case 2:
                    materiaController.cadastrarMateria();
                    break;

                case 3:
                    turmaController.cadastrarTurma();

                case 4:
                    paginaInicial();

            }
        }
        while (opcao != 0);
    }

    public static void paginaConsulta() {
        AlunoController alunoController = new AlunoController();
        MateriaController materiaController = new MateriaController();
        TurmaController turmaController = new TurmaController();

        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Consultar aluno");
            System.out.println("Opção 2 - Consultar matéria");
            System.out.println("Opção 3 - Consultar turma");
            System.out.println("Opção 4 - Voltar para a página inicial");
            System.out.println("_______________________");
            System.out.print("Digite sua opção aqui: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    alunoController.getAlunos();
                    break;

                case 2:
                    materiaController.getmaterias();
                    break;

                case 3:
                    turmaController.getTurmas();

                case 4:
                    paginaInicial();
            }
        }
        while (opcao != 0);
    }
}