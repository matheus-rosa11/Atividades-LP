package org.example;

public class App {
    public static void main(String[] args) {
        Bolo b1 = new Bolo();
        Bolo b2 = new Bolo();
        Bolo b3 = new Bolo();

        b1.sabor = "roxo";
        b1.valor = 32.59;
        b1.qtdVendido = 0;
        b1.comprarBolo(5);
        b1.exibirRelatorio();

        b2.sabor = "morango";
        b2.valor = 38.90;
        b2.qtdVendido = 0;
        b2.comprarBolo(50);
        b2.comprarBolo(60);
        b2.exibirRelatorio();

        b3.sabor = "chocolate";
        b3.valor = 49.90;
        b3.qtdVendido = 0;
        b3.comprarBolo(180);
        b3.exibirRelatorio();

    }
}