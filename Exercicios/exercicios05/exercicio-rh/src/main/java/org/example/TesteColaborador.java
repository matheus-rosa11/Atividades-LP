package org.example;

import java.util.Scanner;

public class TesteColaborador {
    public static void main(String[] args) {
        Scanner leitor1 = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        Funcoes funcao = new Funcoes();

        Colaborador c1 = new Colaborador();
        c1.setNome("Felix");
        c1.setCargo("Estagiário");
        c1.setSalario(1800.00);

        Colaborador c2 = new Colaborador();
        c2.setNome("Fernanda");
        c2.setCargo("Psicóloga");
        c2.setSalario(5000.00);

        RecursosHumanos rh = new RecursosHumanos();

        rh.setTotalPromovidos(0);
        rh.setTotalSalariosReajustados(0);

        System.out.println("INFORMAÇÕES DOS COLABORADORES");
        funcao.escreverLinhaVoid();

        c1.exibirInfo();
        c2.exibirInfo();

        // PROMOVENDO COLABORADORES

        rh.promoverColaborador(c1, "Desenvolvedor Júnior", 3500.00);

        rh.promoverColaborador(c2, "Estagiária de psicologia", 2000.00);

        // REAJUSTES

        rh.reajustarSalario(c1, 10000.00);

        c1.exibirInfo();
        c2.exibirInfo();

        rh.exibirPromovidos();
        rh.exibirReajustes();

    }
}
