package org.example;

import java.util.Scanner;

public class TesteEmpregado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Empregado e1 = new Empregado();

        e1.nome = "João";
        e1.cargo = "Analista de Sistemas";
        e1.salario = 5400.00;

        System.out.println(String.format(
                "Dados atuais:" +
                        "\nNome: %s" +
                        "\nCargo: %s" +
                        "\nSalario: %.2f",
                e1.nome, e1.cargo, e1.salario));

        System.out.println("========================================");

        System.out.println("Calculando reajuste de 15%...");

        e1.reajustarSalario(15);

        System.out.println(String.format(
                "Dados reajustados:\n" +
                "Nome: %s\n" +
                "Cargo: %s" +
                "Salario: %.2f",
                e1.nome, e1.cargo, e1.salario));

//==================== DADOS COM INPUT ======================

        System.out.println("========================================");

        System.out.println("Agora, vamos inserir um novo colaborador.");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Cargo: ");
        String cargo = leitor.nextLine();

        System.out.print("Salario: ");
        Double salario = leitor.nextDouble();

        Empregado e2 = new Empregado();

        e2.nome = nome;
        e2.cargo = cargo;
        e2.salario = salario;

        System.out.print("Qual a porcentagem de reajuste salarial sera recebida? ");
        Integer reajuste = leitor.nextInt();

        e2.reajustarSalario(reajuste);

        System.out.println(String.format(
                "Dados reajustados:" +
                        "\nNome: %s" +
                        "\nCargo: %s" +
                        "\nSalario: %.2f",
                e2.nome, e2.cargo, e2.salario)
        );
    }
}
