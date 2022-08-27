package org.example;

public class VerificarPrimo {
    public Boolean verificarPrimo(Integer numero) {
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0)
                return false;
        }

        return true;
    }
}
