package org.example;

import java.util.Scanner;

public class Ex08CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLn = new Scanner(System.in);

        System.out.println("Qual o nome do aluno? ");
        String nome = leitorLn.nextLine();

        System.out.println("Insira o valor da primeira nota: ");
        Double n1 = leitor.nextDouble();

        System.out.println("Insira o valor da segunda nota: ");
        Double n2 = leitor.nextDouble();

        Double media = (n1 + n2) / 2.0;

        System.out.println(String.format("Olá, %s. Sua media foi %.2f", nome, media));
    }
}
