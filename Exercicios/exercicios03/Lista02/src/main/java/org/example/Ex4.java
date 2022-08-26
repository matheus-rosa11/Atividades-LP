package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);


        System.out.println("Leia vários números até ler o número 0 e calcule a soma dos números lidos ");

        Integer ler = num.nextInt();


        Integer soma = 0;

        while (ler != 0) {

            soma += ler;

            System.out.println("Digite mais um numero: ");

            ler = num.nextInt();

        }

        System.out.println(String.format("A soma dos numeros foi %d ", soma));

    }
}
