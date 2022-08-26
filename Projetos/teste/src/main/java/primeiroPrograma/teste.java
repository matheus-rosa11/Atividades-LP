package primeiroPrograma;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLn = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o nome do seu amigão: ");
        String amigo = leitor.nextLine();
    }
}
