package org.example;

public class Empregado {
    String nome;
    String cargo;
    Double salario;

    public void reajustarSalario(Integer porcentagem) {
        salario += salario * (porcentagem / 100.00);
    }
}
