package org.example;

public class ContaBancaria {
    private Double saldo;
    private String nomeTitular;

    public void depositar(Double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacar(Double valorSaque) {
        saldo -= valorSaque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}
