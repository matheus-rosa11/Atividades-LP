package org.example;

public class RecursosHumanos {
    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    Funcoes functions = new Funcoes();

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }

    public void reajustarSalario(Colaborador colaborador, Double valorReajuste) {
        if (valorReajuste > 0) {
            Double salarioAnterior = colaborador.getSalario();
            colaborador.setSalario(colaborador.getSalario() + valorReajuste);
            totalSalariosReajustados++;
            System.out.println(String.format("O salário do(a) colaborador(a) %s foi reajustado.\n" +
                    "De: R$ %.2f | Para: R$ %.2f", colaborador.getNome(), salarioAnterior, colaborador.getSalario()));
        } else {
            System.out.println("O reajuste deve ser maior que 0 (zero)");
        }
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario > colaborador.getSalario()) {
            String cargoAntigo = colaborador.getCargo();
            Double salarioAntigo = colaborador.getSalario();
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
            System.out.println(String.format(
                    "O colaborador %s foi promovido!\n\n" +
                            "Cargo:\n" +
                            "De: %s | Para: %s\n" +
                            "Salário:\n" +
                            "De: %.2f | Para: %.2f\n" +
                            "%s",
                    colaborador.getNome(),
                    cargoAntigo,
                    colaborador.getCargo(),
                    salarioAntigo,
                    colaborador.getSalario(),
                    functions.escreverLinha()
            ));
        } else {
            System.out.println(String.format("Operação Inválida. Não é possível promover com um salário menor que o atual.\n" +
            "Salário atual: R$ %.2f | Tentativa de promoção: R$ %.2f\n%s", colaborador.getSalario(), novoSalario, functions.escreverLinha()
            ));
        }
    }

    public void exibirPromovidos() {
        System.out.println(String.format(
                "Total de promoções: %d\n" +
                "%s", this.totalPromovidos, functions.escreverLinha()
        ));
    }

    public void exibirReajustes() {
        System.out.println(String.format(
                "Total de reajustes: %d\n" +
                        "%s", this.totalSalariosReajustados, functions.escreverLinha()
        ));
    }
}
