package org.example;

public class ClassesSociais {
    public Double qtdSalariosMinimos(Double renda){
        return renda / 1100;
    }

    public char classeUsuario(Double salariosMinimos) {
        if (salariosMinimos <= 2) {
            return 'E';
        } else if (salariosMinimos > 2 && salariosMinimos <= 4) {
            return 'D';
        } else if (salariosMinimos > 4 && salariosMinimos <= 10) {
            return 'C';
        } else if (salariosMinimos > 10 && salariosMinimos <= 20) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
