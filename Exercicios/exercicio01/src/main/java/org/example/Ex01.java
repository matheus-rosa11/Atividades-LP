package org.example;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorLn = new Scanner(System.in);

        System.out.print("E-mail: ");
        String email = leitor.nextLine();
        System.out.print("Senha: ");
        String senha = leitor.nextLine();

        System.out.println("Quantas vezes você pode errar a senha antes de bloquear o acesso? ");
        Integer tentativas = leitor.nextInt();

        System.out.println("Tente fazer login");

        for (Integer i = tentativas; i >= 0; i--){
            System.out.println("Tentativas restantes: " + i);
            System.out.print("E-mail: ");
            String inputEmail = leitorLn.nextLine();
            System.out.print("Senha: ");
            String inputSenha = leitorLn.nextLine();

            if (inputEmail.equals(email) && inputSenha.equals(senha)){
                System.out.println("Login realizado com sucesso.");
                break;
            } else {
                if (i < 1){
                    System.out.println("Voce excedeu o limite de tentativas. Reinicie o programa para tentar novamente");
                } else {
                    System.out.println("Email ou senha invalidos. Tente novamente.");
                }
            }
        }
    }
}