package org.example;

import java.util.Scanner;

public class TesteVerificarPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero para verificarmos se ele e primo: ");
        Integer inputUsuario = scanner.nextInt();

        VerificarPrimo n1 = new VerificarPrimo();

        Boolean primo = n1.verificarPrimo(inputUsuario);

        if (primo) {
            System.out.println("Sim, o numero " + inputUsuario + " e primo!");
        } else {
            System.out.println("Nao, o numero " + " nao e primo.");
        }
    }
}
