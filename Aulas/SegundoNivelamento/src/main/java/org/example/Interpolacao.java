package org.example;

public class Interpolacao {
    public static void main(String[] args) {
        Double numero = Math.random() * 10;

        Integer random = (int) (Math.random() * 9) + 1;

        String nome = "Serjo";

        System.out.println(String.format("Meu nome é %s", nome));

        System.out.println(random);
    }

}
