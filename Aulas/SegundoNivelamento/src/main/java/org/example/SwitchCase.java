package org.example;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um dia da semana (em numero): ");
        Integer dia = leitor.nextInt();
        String diaDaSemana = "";

        switch (dia) {
            case 1:
                diaDaSemana = "segunda-feira";
                break;
            case 2:
                diaDaSemana = "terça-feira";
                break;
            case 3:
                diaDaSemana = "quarta-feira";
                break;
            case 4:
                diaDaSemana = "quinta-feira";
                break;
            case 5:
                diaDaSemana = "sexta-feira";
                break;
            case 6:
                diaDaSemana = "sábado";
                break;
            case 7:
                diaDaSemana = "domingo";
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
        System.out.println("Hoje e " + diaDaSemana + "!");
    }
}
