package org.example;

public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    public String getNome() {
        return nome;
    }

    Funcoes functions = new Funcoes();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println(String.format(
                "Colaborador: %s\n" +
                "Cargo: %s\n" +
                "Salário: %.2f\n" +
                "%s",
                this.nome, this.cargo, this.salario, functions.escreverLinha()
        ));
    }


}
