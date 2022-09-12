package org.example;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    public Double calcularFrete() {

        Integer porcentagemTamanho = 0;
        Integer porcentagemDistancia;
        Boolean tamanhoValido = false;

        //=========== TAMANHO ===========

        if (tamanho.equals("P")) {
            porcentagemTamanho = 1;
            tamanhoValido = true;

        } else if (tamanho.equals("M")) {
            porcentagemTamanho = 3;
            tamanhoValido = true;

        } else if (tamanho.equals("G")) {
            porcentagemTamanho = 5;
            tamanhoValido = true;

        } else {
            tamanhoValido = false;
        }

        //=========== DISTANCIA ===========

        if (tamanhoValido) {

            if (distancia <= 50.0) {
                porcentagemDistancia = 3;
            } else if (distancia > 50 && distancia <= 200) {
                porcentagemDistancia = 5;
            } else {
                porcentagemDistancia = 7;
            }

            Double frete = valorEncomenda * ((porcentagemDistancia.doubleValue() + porcentagemTamanho.doubleValue()) / 100);

            return frete;
        } else {
            return 0.0;
        }
    }

    public void emitirEtiqueta() {

        Double frete = calcularFrete();

        if (frete >= 0.0) {
            System.out.println(String.format(
                    "***** ETIQUETA *****" +
                    "\nEndereço do remetente: %s" +
                    "\nEndereço do destinatario: %s" +
                    "\nTamanho: " + tamanho +
                    "\n======================================================" +
                    "\nValor encomenda: R$ %.2f" +
                    "\nValor frete: R$ %.2f" +
                    "\n======================================================" +
                    "\nValor total: %.2f",
                    enderecoRemetente, enderecoDestinatario, valorEncomenda, frete, (valorEncomenda + frete))
            );
        } else {
            System.out.println("Valores invalidos. Tente novamente");
        }

    }
}
