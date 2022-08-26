package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("JOGADOR 1");
        Integer n1 = leitor.nextInt();
        System.out.println("JOGADOR 2");
        Integer n2 = leitor.nextInt();
        System.out.println("JOGADOR 3");
        Integer n3 = leitor.nextInt();
        System.out.println("JOGADOR 4");
        Integer n4 = leitor.nextInt();
        System.out.println(GenerateRandom(n1, n2, n3, n4));
    }

    public static String GenerateRandom(int n1, int n2, int n3, int n4) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 10);
        Integer menor = numeroAleatorio - n1;

        Integer[] apostas = {n1, n2, n3, n4};
        Integer vencedor = 0;

        for (Integer i = 1; i <= apostas.length; i++) {
            if (apostas[i] < menor) {
                menor = numeroAleatorio - apostas[i];
                vencedor = i;
            }
        }

        String resultado = "O numero mais proximo foi " + menor + ", logo, o vencedor foi: JOGADOR " + vencedor;

        return resultado;
    }
}
