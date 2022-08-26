package org.example;

public class NumerosPares {
    public static void main(String[] args) {
        Integer pares = 0;
        for (Integer i = 0; i <= 40; i++) {
            if(i % 2 == 0){
                System.out.println("O numero " + i + " e par");
                pares++;
            }
        }

        System.out.println("Nesta contagem existem " + pares + " numeros pares");
    }
}
