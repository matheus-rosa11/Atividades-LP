package org.example;

public class OperadorTernario {
    public static void main(String[] args) {
//        Boolean bloqueado = false;
//        String frase;
//
//        if (bloqueado){
//            frase = "Usuário bloqueado!";
//        } else {
//            frase = "Usuário desbloqueado!";
////        }
//
//        System.out.println(frase);

        // Operador ternário
//
//        frase = bloqueado ? "Usuário bloqueado." : "Usuário desbloqueado!";

        Double salario = 1000.0;
        Double bonus;

        bonus = salario >= 1000.0 ? salario * 0.1 : salario * 0.3;

        Double saldo = salario + bonus;

        System.out.println(String.format("Seu salário final é de %.2f", saldo));
    }

}
