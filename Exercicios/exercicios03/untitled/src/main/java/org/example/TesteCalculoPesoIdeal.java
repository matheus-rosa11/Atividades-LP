package org.example;

import java.util.Scanner;

public class TesteCalculoPesoIdeal {
    public static void main(String[] args) {
        Boolean continuar = true;
        Scanner leitor = new Scanner(System.in);
        String sexoUsuario;
        String sexoUsuario2;
        Double alturaUsuario;
        Double alturaUsuario2;

        while (continuar) {
            System.out.print("Insira o seu sexo (M | F): ");
            sexoUsuario = leitor.next();
            System.out.print("Insira a sua altura (Ex.: 1,80): ");
            alturaUsuario = leitor.nextDouble();
            System.out.println("Deseja cadastrar uma segunda pessoa? (S | N): ");
            String respostaUsuario = leitor.next();

            if (respostaUsuario.toLowerCase().equals("s")) {

                System.out.print("Insira o seu sexo (M | F): ");
                sexoUsuario2 = leitor.next();
                System.out.print("Insira a sua altura (Ex.: 1,80): ");
                alturaUsuario2 = leitor.nextDouble();

                System.out.println("Calculando peso ideal...");

                CalculoPesoIdeal p1 = new CalculoPesoIdeal();
                CalculoPesoIdeal p2 = new CalculoPesoIdeal();

                Double pesoIdealP1 = p1.calcularPesoIdeal(sexoUsuario, alturaUsuario);
                Double pesoIdealP2 = p2.calcularPesoIdeal(sexoUsuario2, alturaUsuario2);

                System.out.println(String.format("Primeira pessoa: Seu peso ideal e de %.2fKg", pesoIdealP1));
                System.out.println(String.format("Segunda pessoa: Seu peso ideal e de %.2fKg", pesoIdealP2));
                continuar = false;

            } else if (respostaUsuario.toLowerCase().equals("n")) {

                System.out.println("Calculando peso ideal...");
                CalculoPesoIdeal p1 = new CalculoPesoIdeal();
                Double pesoIdealP1 = p1.calcularPesoIdeal(sexoUsuario, alturaUsuario);
                System.out.println(String.format("Seu peso ideal e de %.2fKg", pesoIdealP1));
                continuar = false;

            }
        }
    }
}
