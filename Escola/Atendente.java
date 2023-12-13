package Escola;

public class Atendente extends Funcionario{
    String departamento;
    public Atendente(String name, String cpf, String id, Double salary, String departamento) {
        super(name,cpf, id, salary);
        this.departamento = departamento;
    }
    @Override
    public void exibirDados() {
        System.out.printf("%nAtendente: %s%n ID No. %s%n Departamento: %s%n ", this.getName(), this.getId(), departamento);
    }
}
