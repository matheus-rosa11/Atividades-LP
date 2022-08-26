package primeiroPrograma;

import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
        // new == instanciar = criar um objeto
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        Integer idade = input.nextInt();
        System.out.print("Digite sua altura: ");
        Double altura = input.nextDouble();
        System.out.println();

        System.out.println("Dados do cadastro:");
        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Altura: " + String.format("%.2f", altura));

    }
}
