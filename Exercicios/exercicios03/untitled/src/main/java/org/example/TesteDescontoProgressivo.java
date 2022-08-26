package org.example;

import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de desconto progressivo!\n");

        System.out.print("Digite o valor unitario do produto: ");
        Double precoUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade: ");
        Integer qtdProdutos = scanner.nextInt();

        DescontoProgressivo calcDesconto = new DescontoProgressivo();
        Integer descontoUsuario = calcDesconto.desconto(qtdProdutos);
        Double precoBruto = qtdProdutos * precoUnitario;
        Double valorTotal = calcDesconto.retornarValorFinal(descontoUsuario, precoBruto);
        TesteDescontoProgressivo main = new TesteDescontoProgressivo();

        main.escreverLinha();
        TesteDescontoProgressivo relatorio = new TesteDescontoProgressivo();
        relatorio.escreverRelatorio(precoUnitario, qtdProdutos, valorTotal);

    }

    public void escreverLinha() {
        System.out.println("===========================");
    }

    public void escreverRelatorio(Double precoUnitario, Integer qtdProdutos, Double valorTotal) {
        System.out.println(String.format("Valor do produto: R$ %.2f", precoUnitario));
        System.out.println("Quantidade: " + qtdProdutos);
        escreverLinha();
        System.out.println(String.format("Valor com desconto: %.2f", valorTotal));
    }
}
