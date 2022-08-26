// OBS.: Erros de ortografia propositais devido linguagem da IDE não permitir caracteres especiais
package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer random = ThreadLocalRandom.current().nextInt(0, 10);

        System.out.print("Adivinhe o numero que a maquina pensou (0 a 10): ");
        Integer resposta = leitor.nextInt();

        Integer contador = 0;

        while (resposta != random) {
            System.out.println("Errado. Tente novamente:");
            System.out.print("Adivinhe o numero que a maquina pensou (0 a 10):");
            resposta = leitor.nextInt();
            contador++;
        }

        System.out.println("Voce venceu, parabens!\n");

        if (contador <= 3) {
            System.out.println("Voce e MUITO sortudo!");
        } else if (contador > 3 && contador <= 10) {
            System.out.println("Você e sortudo.");
        } else {
            System.out.println("E melhor voce parar de apostar e ir trabalhar.");
        }

    }
}
