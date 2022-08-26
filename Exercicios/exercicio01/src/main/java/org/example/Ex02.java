package org.example;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Integer qtd0a3 = reader.nextInt();
        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        Integer qtd4a16 = reader.nextInt();
        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        Integer qtd17a18 = reader.nextInt();

        Integer filhos = qtd0a3 + qtd4a16 + qtd17a18;
        Double bolsa = qtd0a3 * 25.12 + qtd4a16 * 15.88 + qtd17a18 * 12.44;

        System.out.println("Você tem um total de " + filhos + " filhos e vai receber R$" + String.format("%.2f", bolsa));
    }
}
