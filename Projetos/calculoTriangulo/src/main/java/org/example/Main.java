package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira os valores do triangulo X: ");

        x.A = leitor.nextDouble();
        x.B = leitor.nextDouble();
        x.C = leitor.nextDouble();

        System.out.print("Insira os valores do triangulo Y: ");

        y.A = leitor.nextDouble();
        y.B = leitor.nextDouble();
        y.C = leitor.nextDouble();

        Double areaX = x.Area();
        Double areaY = y.Area();

        System.out.println("A area do triangulo X e igual a" + areaX);
        System.out.println("A area do triangulo Y e igual a" + areaY);

        if (areaX > areaY){
            System.out.println("O maior triangulo e o X");
        } else if (areaY > areaX){
            System.out.println("O maior triangulo e o Y");
        } else{
            System.out.println("Erro ou empate.");
        }

    }
}