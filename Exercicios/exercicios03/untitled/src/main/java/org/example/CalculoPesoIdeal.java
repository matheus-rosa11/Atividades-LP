package org.example;

public class CalculoPesoIdeal {
    public Double calcularPesoIdeal(String sexo, Double altura) {
        if (sexo.toLowerCase().equals("m")) {
            return (62.1 * altura) - 44.7;
        } else if (sexo.toLowerCase().equals("f")) {
            return (72.7 * altura) - 58.0;
        } else {
            return 0.0;
        }
    }
}
