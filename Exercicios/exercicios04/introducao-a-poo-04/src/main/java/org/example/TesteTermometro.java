package org.example;

import java.util.Scanner;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro t1 = new Termometro();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura maxima desejada (°C): ");
        Double tempMaxUsuario = scanner.nextDouble();

        t1.temperaturaMax = tempMaxUsuario;

        System.out.print("Insira a temperatura minima desejada (°C): ");
        Double tempMinUsuario = scanner.nextDouble();

        t1.temperaturaMin = tempMinUsuario;

        System.out.print("Insira a temperatura atual (°C): ");
        Double tempAtualUsuario = scanner.nextDouble();

        t1.temperaturaAtual = tempAtualUsuario;

        System.out.println("Quantos graus celsius voce deseja acrescentar na temperatura atual?");
        Double inputAcresc = scanner.nextDouble();

        t1.aumentaTemperatura(inputAcresc);

        System.out.println("Quantos graus celsius voce deseja diminuir da temperatura atual?");
        Double inputDesc = scanner.nextDouble();

        t1.diminuiTemperatura(inputDesc);

        t1.exibeFahrenheitKelvin();

    }
}
