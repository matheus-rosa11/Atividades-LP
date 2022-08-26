package org.example;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o limite de peso do elevador: ");
        Double limitePeso = leitor.nextDouble();

        System.out.print("Insira o limite de pessoas no elevador: ");
        Integer limitePessoas = leitor.nextInt();

        Double pesoPessoa;
        Double[] pessoas = {0.0, 0.0, 0.0};
        Double pesoTotal = 0.0;
        Integer vagasPreenchidas = 0;

        for (int i = 0; i <= 2; i++) {
            System.out.println("Qual o peso da " + (i + 1) + "a pessoa");
            pesoPessoa = leitor.nextDouble();
            pessoas[i] = pesoPessoa;
            pesoTotal += pesoPessoa;
            vagasPreenchidas++;
            System.out.println("Registrado com sucesso.");
        }

        System.out.println("Entraram " + vagasPreenchidas + " pessoas no elevador, no qual cabem " + limitePessoas + " pessoas.");
        System.out.println("O peso total no elevador e de " + String.format("%.2f", pesoTotal) + "Kg; sendo que ele suporta " + String.format("%.2f", limitePeso) + "Kg");
        System.out.println("Vagas disponiveis: " + (limitePessoas - vagasPreenchidas) + "\nPeso restante: " + (limitePeso - pesoTotal));
    }
}
