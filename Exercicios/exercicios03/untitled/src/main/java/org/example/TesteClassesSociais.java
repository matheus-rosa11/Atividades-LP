package org.example;

import java.util.Scanner;

public class TesteClassesSociais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua renda mensal: ");
        Double rendaUsuario = scanner.nextDouble();

        ClassesSociais classeSocial = new ClassesSociais();
        Double salariosMinimosUsuario = classeSocial.qtdSalariosMinimos(rendaUsuario);
        char classeSocialUsuario = classeSocial.classeUsuario(salariosMinimosUsuario);

        System.out.println(String.format("Voce recebe aproximadamente %.1f.", salariosMinimosUsuario));
        System.out.println("Voce pertence a classe social " + classeSocialUsuario);
    }
}


