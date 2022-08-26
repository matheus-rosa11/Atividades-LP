package org.example;

public class NumerosImpares {
    public static void main(String[] args) {
        Integer impares = 0;
        for (Integer i = 0; i <= 90; i++){
            if (i % 2 != 0){
                System.out.println("O numero " + i + " e impar.");
            }
        }
        System.out.println("Nesta contagem, existem " + impares + " numeros impares");
    }
}
