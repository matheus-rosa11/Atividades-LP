package org.example;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o seu salário bruto? R$ ");
        Double salario = leitor.nextDouble();
        System.out.print("Qual seu custo de transporte diário? (somente ida): ");
        Double conducao = leitor.nextDouble();

        Double inss = salario * 0.1;
        Double ir = salario * 0.2;
        Double vt = conducao * 2 * 22;
        Double liquido = salario - inss - ir - vt;

        System.out.println("Seu salario bruto e de R$ " + String.format("%.2f", salario) + ", tem um total de R$ " + String.format("%.2f", salario - liquido) + " em descontos e recebera um liquido de R$ " + String.format("%.2f", liquido) + "; alem de " + String.format("%.2f", vt) + " de vale-transporte, resultando numa renda mensal de R$ " + String.format("%.2f", liquido + vt));
    }
}
