package org.example;

public class App {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.depositar(10.0);

        ContaBancaria c2 = new ContaBancaria();

        c2.depositar(10000.00);

        System.out.println(String.format("Conta 01: %.2f", c1.getSaldo()));
        System.out.println(String.format("Conta 02: %.2f", c2.getSaldo()));

    }
}