package org.example;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para calcularmos sua tabuada: ");
        Integer base = scanner.nextInt();

        for (Integer i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", base, i, (base * i)));
        }

        System.out.println("Fim da execucao.");
    }
}
