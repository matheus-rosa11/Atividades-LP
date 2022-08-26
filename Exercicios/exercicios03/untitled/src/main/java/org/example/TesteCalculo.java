package org.example;

import java.util.Scanner;

public class TesteCalculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculo media = new Calculo();

        System.out.print("Insira a primeira nota (40%): ");
        Double n1 = leitor.nextDouble();
        System.out.print("Insira a segunda nota (60%): ");
        Double n2 = leitor.nextDouble();
        Double notaMedia = media.calcularMedia(n1, n2);

        System.out.println(String.format("A sua media foi de %.2f", notaMedia));
    }
}