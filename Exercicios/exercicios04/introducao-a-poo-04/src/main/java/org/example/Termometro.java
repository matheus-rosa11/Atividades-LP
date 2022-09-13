package org.example;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    public void aumentaTemperatura(Double somaTemperatura) {
        Double novaTemperatura = temperaturaAtual + somaTemperatura;

        if (novaTemperatura > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual += somaTemperatura;
        }
    }

    public void diminuiTemperatura(Double subTemperatura) {
        Double novaTemperatura = temperaturaAtual - subTemperatura;

        if (novaTemperatura < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual -= subTemperatura;
        }
    }

    public void exibeFahrenheitKelvin() {
        Double atualFahrenheit = calcularFahrenheit();
        Double atualKelvin = calcularKelvin();

        System.out.println(String.format("Temperatura atual\nCelsius: %.2f | Fahrenheit: %.2f | Kelvin: %.2f", temperaturaAtual, atualFahrenheit, atualKelvin));

    }

    public Double calcularFahrenheit() {
        Double celsius = temperaturaAtual;

        return (temperaturaAtual * 1.8) + 32;
    }

    public Double calcularKelvin() {
        return temperaturaAtual + 273;
    }
}
