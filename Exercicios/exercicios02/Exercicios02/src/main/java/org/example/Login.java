package org.example;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);

        String inputUser = "";
        String inputPwd = "";

        while (!(inputUser.equals("admin") && inputPwd.equals("#Bandtec"))) {
            System.out.print("Insira seu usuario: ");
            inputUser = leitor.nextLine();
            System.out.print("Insira sua senha: ");
            inputPwd = leitor.nextLine();

            if (inputUser.equals("admin") && inputPwd.equals("#Bandtec")) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Usuario ou senha invalidos. Tente novamente");
            }
        }
    }
}
