package org.example;

import java.util.Scanner;

public class TesteMetodos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        Utilitaria texto = new Utilitaria();
//
//        texto.exibirLinha();
//        texto.exibirNome("serjo em ingles");
//        System.out.println("Exibindo nome decorado");
//        texto.exibirNomeDecorado("Daniel");
//
//        System.out.print("Digite o primeiro numero: ");
//        Double num1 = leitor.nextDouble();
//        System.out.print("Digite o segundo numero: ");
//        Double num2 = leitor.nextDouble();
//        System.out.println(calc.somar(num1, num2));
//
//        Double resultado = calc.somar(num1, num2);
//        System.out.println(resultado);

        texto.exibirLinha();

        System.out.print("Insira um numero para descobrirmos se e par: ");
        Double numero = leitor.nextDouble();

        Calculadora isPar = new Calculadora();
        String validacao;
        validacao = isPar.numeroPar(numero) ?  "par" : "impar";
        System.out.println(validacao);
    }
}