package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex6 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("escolha um numero de 0 a 10");

        int numeroCliente = num.nextInt();

        int random = ThreadLocalRandom.current().nextInt(0,10);

        String frase;

        Integer soma = 0;

        while(numeroCliente != random){

            System.out.println(random);

            random = ThreadLocalRandom.current().nextInt(0,10);

            soma++;

        }

        if(soma <=3){

            System.out.println("Você é MUITO sortudo");

        }else if(soma <=10){

            System.out.println("Você é sortudo");

        }else{

            System.out.println("É melhor você parar de apostar e ir trabalhar");

        }

    }
}
