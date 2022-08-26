package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean primeiraVez = true;
        Integer random;
        Integer pares = 0;
        Integer impares = 0;
        Integer acertos = 0;

        System.out.print("Insira um numero de 1 a 100: ");
        Integer inputNumero = leitor.nextInt();

        for (Integer i = 1; i <= 200; i++){
            random = ThreadLocalRandom.current().nextInt(1, 100);

            if (inputNumero == random){
                System.out.println("Seu numero foi sorteado!");

                if (primeiraVez){
                    System.out.println("O primeiro numero sorteado foi " + random);
                    primeiraVez = false;
                    break;
                }
                break;
            }

            System.out.println(random);

            if (random % 2 == 0){
                pares++;
            } else if(random % 2 != 0){
                impares++;
            }
        }

        System.out.println(String.format("Foram sorteados %d numeros pares e %d numeros impares.", pares, impares));
    }
}
