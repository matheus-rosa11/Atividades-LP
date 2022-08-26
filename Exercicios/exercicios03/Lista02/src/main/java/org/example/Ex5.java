package org.example;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome de usuario:");

        String nome = ler.nextLine();

        System.out.println("Digite sua senha:");

        String senha = ler.nextLine();

        while (!nome.equals("admin") &&

                !senha.equals("#SPtech2022")) {

            System.out.println("Login e/ou senha inválido");

            System.out.println("Digite novamente seu nome de usuario:");

            nome = ler.nextLine();


            System.out.println("Digite sua senha:");

            senha = ler.nextLine();

        }

        System.out.println("Login realizado com sucesso");

    }
}
