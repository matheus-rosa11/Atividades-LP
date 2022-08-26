package org.example;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);


        System.out.println("Digite um numero");

        Integer numero = num.nextInt();

        int i = 1;


        while (i <= 10) {

            Integer conta = i * numero;

            System.out.println(String.format("%d X %d = %d ", numero, i, conta));

            i++;

        }

    }
}
