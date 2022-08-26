package org.example;

import java.util.Scanner;

public class Acumulador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer somaTotal = 0;
        Integer contador = 0;

        System.out.print("Insira um número inteiro qualquer: ");
        Integer inputNumero = scanner.nextInt();

        do {
            ++contador;
            somaTotal += inputNumero;
            System.out.print("Insira outro número: ");
            inputNumero = scanner.nextInt();
        } while (inputNumero != 0);

        System.out.println(String.format("Voce digitou %d numeros e a soma total foi de %d", (contador + 1), somaTotal));
    }

}
