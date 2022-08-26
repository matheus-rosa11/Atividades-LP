package org.example;

public class Triangulo {
    Double A;
    Double B;
    Double C;

    public Double Area(){
        double p = (A + B + C) / 2.0;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

}
