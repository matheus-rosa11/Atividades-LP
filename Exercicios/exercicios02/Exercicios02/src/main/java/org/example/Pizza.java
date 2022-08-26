package org.example;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        String maior = "";
        for (Integer i = 1; i <= 10; i++) {
            System.out.println("Vote em alguma pizza:");
            System.out.println("" +
                    "5. Mussarela\n" +
                    "25. Calabresa\n" +
                    "50. Quatro queijos");
            Integer voto = scanner.nextInt();

            if (voto == 5){
                mussarela++;
            } else if (voto == 25){
                calabresa ++;
            } else if (voto == 50){
                quatroQueijos++;
            } else {
                System.out.println("Numero invalido. Tente novamente.");
                i--;
            }
        }

        maior = "mussarela";

        if (calabresa > mussarela && quatroQueijos <= mussarela) {
            maior = "calabresa";
            System.out.println(String.format("A pizza mais votada foi a de calabresa, com %d votos.", calabresa));
        } else if (quatroQueijos > mussarela && calabresa <= mussarela) {
            maior = "quatro queijos";
            System.out.println(String.format("A pizza mais votada foi a de Quatro Queijos, com %d votos.", quatroQueijos));
        } else if (quatroQueijos == mussarela) {
            System.out.println(String.format("Deu empate! Os mais votados foram Quatro Queijos, com %d votos e Mussarela, com %d votos.", quatroQueijos, mussarela));
        } else if (calabresa == mussarela) {
            System.out.println(String.format("Deu empate! Os mais votados foram Calabresa, com %d votos e Mussarela, com %d votos.", calabresa, mussarela));
        } else if (calabresa == quatroQueijos) {
            System.out.println(String.format("Deu empate! Os mais votados foram Quatro Queijos, com %d votos e Calabresa, com %d votos.", quatroQueijos, calabresa));
        } else {
            System.out.println(String.format("A pizza mais votada foi a de calabresa, com %d votos.", mussarela));
        }
    }
}
