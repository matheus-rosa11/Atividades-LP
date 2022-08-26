package org.example;

public class ContadorVariado {
    public static void main(String[] args) {
        Double numero = 0.15;
        for (Integer i = 0; i < 5; i++) {
            numero += 0.15;

            System.out.println(String.format("%.2f", numero));
        }
    }
}
