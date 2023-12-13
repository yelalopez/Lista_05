package Escola;

public abstract class Funcionario extends Pessoa{
    private String id;
    private Double salary;
    private Double increaseSalary;

    public Funcionario(String name, String cpf, String id, Double salary) {
        super(name, cpf);
        this.id = id;
        this.salary = salary;
        this.increaseSalary = 0.1;
    }
    public final void increaseSalary(){
        this.salary += this.salary * this.increaseSalary;
        System.out.printf("O novo salário é de : %.2f%n", this.salary);
    }

    public final double calcularSalario(int horasTrabalhadas, double valorHora) {
        double newSalary = horasTrabalhadas * valorHora;
        setSalary(newSalary);
        return newSalary;
    }

    public String getId(){
        return this.id;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Double getSalary(){
        return this.salary;
    }


}
