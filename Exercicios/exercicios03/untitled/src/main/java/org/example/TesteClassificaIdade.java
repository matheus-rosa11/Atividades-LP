package org.example;

import java.util.Scanner;

public class TesteClassificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a sua idade: ");
        Integer idadeUsuario = scanner.nextInt();

        TesteClassificaIdade classificacao = new TesteClassificaIdade();
        classificacao.classificaIdade(idadeUsuario);
    }
    public void classificaIdade(Integer idade) {
        if (idade >= 0 && idade <= 2) {
            System.out.println("Bebe");
        } else if (idade > 2 && idade <= 11) {
            System.out.println("Criança");
        } else if (idade > 11 && idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade > 19 && idade <= 30) {
            System.out.println("Jovem");
        } else if (idade > 30 && idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
