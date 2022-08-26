package org.example;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Vamos calcular uma potencia.");
        System.out.print("Insira o valor da base (inteiro): ");
        Integer base = leitor.nextInt();
        System.out.print("Insira o valor do expoente (inteiro): ");
        Integer expoente = leitor.nextInt();
        Integer resultado = 1;

        if (base == 0) {
            if (expoente == 0) {
                resultado = 1;
            } else {
                resultado = 0;
            }
        } else if (expoente == 0) {
            resultado = 1;
        } else {
            for (Integer i = 1; i <= expoente; i++){
                resultado *= base;
            }
        }
        System.out.println("A potencia de " + base + " elevado a " + expoente + " e igual a " + resultado);
    }
}
