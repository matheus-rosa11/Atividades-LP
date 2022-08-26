package org.example;

public class Calculadora {
    Double somar(Double n1, Double n2) {
        return n1 + n2;
    }

    Boolean numeroPar(Double numero){
        Boolean isPar = numero % 2 == 0.0;
        return isPar;
    }
}
