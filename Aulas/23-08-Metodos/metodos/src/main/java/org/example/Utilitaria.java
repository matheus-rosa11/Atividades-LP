package org.example;

public class Utilitaria {
    void exibirLinha(){
        System.out.println("----------------");
    }

    void exibirNome(String nomeUsuario){
        System.out.println(String.format("Nome: %s", nomeUsuario));
    }

    void exibirNomeDecorado(String nomeDecorado){
        System.out.println("-----------------");
        System.out.println(String.format("Nome: %s", nomeDecorado));
        System.out.println("-----------------");
    }
}
