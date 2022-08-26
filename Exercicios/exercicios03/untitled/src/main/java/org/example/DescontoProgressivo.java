package org.example;

public class DescontoProgressivo {
    public Integer desconto(Integer qtdProdutos) {
        switch (qtdProdutos) {
            case 1:
                return 10;
            case 2:
                return 20;
            case 3:
                return 30;
            default:
                return 30;
        }
    }

    public Double retornarValorFinal(Integer desconto, Double preco) {
        Integer descontoReal = 100 - desconto;
        Double valorTotal = (preco * descontoReal) / 100;
        return valorTotal;
    }
}
