package Escola;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String name, String cpf, String id, Double salary, String disciplina) {
        super(name, cpf, id, salary);
        this.disciplina = disciplina;
    }
    @Override
    public void exibirDados() {
        System.out.printf("Professor: %s%nID No. %s%nDisciplina: %s%n ", this.getName(), this.getId(), this.disciplina);
    }
}
