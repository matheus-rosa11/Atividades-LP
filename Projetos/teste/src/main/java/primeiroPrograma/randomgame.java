package primeiroPrograma;

import java.util.Random;
import java.util.Scanner;

public class randomgame {
    public static void main(String[] args) {
        Random gerador = new Random();
        Integer pontos = 0;
        Integer pontosMaquina = 0;

        for (int i = 5; i > 0; i--){
            System.out.println("Voce tem " + i + " tentativas restantes.");
            Integer maquina = gerador.nextInt(10);
            System.out.print("Adivinhe o numero que a maquina esta pensando: ");
            Scanner resposta = new Scanner(System.in);
            Integer jogador = resposta.nextInt();

            if (jogador == maquina){
                System.out.println("Parabens, voce pontuou! A maquina pensou em " + maquina);
                pontos++;
            } else {
                System.out.println("A maquina pontuou :( Ela pensou no numero " + maquina + ". Tente novamente!");
                pontosMaquina++;
            }
        }

        if (pontos <= 1){
            System.out.println("Acabou o jogo! Voce fez " + pontos + " ponto.");
        } else {
            System.out.println("Acabou o jogo! Voce fez " + pontos + " pontos.");
        }
    }
}
