package org.example;

public class Bolo {
    String sabor;
    Double valor;
    Integer qtdVendido;

    public void comprarBolo(Integer qtdDesejada) {

        Integer saldoTemporario = qtdVendido + qtdDesejada;

        if (saldoTemporario > 100) {
            System.out.println(String.format("Seu pedido ultrapassou nosso limite diario para o bolo de %s.", sabor));
        } else {
            qtdVendido += qtdDesejada;
        }
    }
    public void exibirRelatorio() {

        if(qtdVendido <= 0) {
            System.out.println(String.format("O bolo de %s nao vendeu hoje. ", sabor));
        } else {
            System.out.println(String.format("O bolo de %s foi comprado %d vezes hoje, totalizando R$%.2f", sabor, qtdVendido, valor * qtdVendido));
        }

    }
}
