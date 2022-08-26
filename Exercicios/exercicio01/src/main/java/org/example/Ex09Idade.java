package org.example;

import java.util.Scanner;

public class Ex09Idade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLn = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = leitorLn.nextLine();
        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?", nome));
        Integer ano = leitor.nextInt();

        System.out.println(String.format("Em 2030, você terá %d anos", (2030 - ano)));
    }
}
