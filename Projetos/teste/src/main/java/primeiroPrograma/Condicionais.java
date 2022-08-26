package primeiroPrograma;

public class Condicionais {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;

        if (numero01 > numero02) {
            System.out.println(numero01 + " é maior que " + numero02);
        }else if(numero01 < numero02){
            System.out.println(numero02 + " é maior que " + numero01);
        }else{
            System.out.println(numero01 + " é igual a " +numero02);
        }

        Boolean isBloqueado = true;

        if(isBloqueado){
            System.out.println("usuario bloqueado");
        }else{
            System.out.println("usuario desbloqueado");
        }

        String nome01 = "João";
        String nome02 = "Jorge";

        if (nome01.equals (nome02)) {
            System.out.println("São iguais");
        } else{
            System.out.println("são diferentes");
        }
    }
}
