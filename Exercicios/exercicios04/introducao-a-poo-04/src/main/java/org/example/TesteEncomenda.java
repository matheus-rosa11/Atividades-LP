package org.example;

public class TesteEncomenda {

    // prof, nesse ex eu fiz uma conta no metodo Encomenda.calcularFrete();
    // que utilizou uma função doubleValue(), porque o Java não deixava dividir
    // os valores por serem int e o return ser double, foi o melhor jeito que encontrei :D

    public static void main(String[] args) {
        Encomenda e1 = new Encomenda();

        e1.tamanho = "M";
        e1.enderecoRemetente = "Rua do Sim";
        e1.enderecoDestinatario = "Rua Santos da Gloria, 18";
        e1.distancia = 500.00;
        e1.valorEncomenda = 100.00;

        e1.emitirEtiqueta();
    }
}
