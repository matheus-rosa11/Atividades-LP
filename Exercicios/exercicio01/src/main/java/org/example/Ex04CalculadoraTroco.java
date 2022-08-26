package org.example;

import java.util.Scanner;

public class Ex04CalculadoraTroco {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um produto: ");
        String produto = leitor.nextLine();
        System.out.print("Qual o valor unitario desse produto? ");
        Double valorUnitario = valor.nextDouble();
        System.out.print("Quantos foram vendidos? ");
        Integer qtdVendidos = valor.nextInt();
        System.out.print("Quanto o cliente pagou pelo produto? R$");
        Double valorPago = valor.nextDouble();

        Double troco = valorPago - valorUnitario * qtdVendidos;
        System.out.println("Seu troco sera de R$" + String.format("%.2f", troco));
    }
}
