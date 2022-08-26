package org.example;

import java.util.Scanner;

public class Ex05Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Double n1, n2 = 0.0;

        System.out.print("Digite um numero: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextDouble();

        double soma = n1 + n2;
        double sub = n1 - n2;
        double multi = n1 * n2;
        double divi = n1 / n2;

        System.out.println("Soma: \n" + soma + "\nSubtracao: \n" + sub + "\nSultiplicacao: \n" + multi + "\nDivisao: \n" + divi);

    }
}
