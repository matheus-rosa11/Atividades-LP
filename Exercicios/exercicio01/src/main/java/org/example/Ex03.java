package org.example;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLn = new Scanner(System.in);
        Integer calorias = 0;
        Integer totalMinutos = 0;

        System.out.print("Qual o seu nome: ");
        String nome = leitorLn.nextLine();
        System.out.print("Quanto tempo (em minutos) voce passou se aquecendo? ");
        Integer tempoAquecimento = leitor.nextInt();
        System.out.print("Quanto tempo (em minutos) você passou fazendo exercicios aerobicos? ");
        Integer tempoAerobico = leitor.nextInt();
        System.out.print("Quanto tempo (em minutos) você passou fazendo musculacao? ");
        Integer tempoMusculacao = leitor.nextInt();

        calorias += tempoAquecimento * 12 + tempoAerobico * 20 + tempoMusculacao * 25;
        totalMinutos += tempoAquecimento + tempoAerobico + tempoMusculacao;

        System.out.println("Ola " + nome + "! Voce fez um total de " + totalMinutos + " minutos de exercicios e perdeu cerca de " + calorias + " calorias");
    }
}
