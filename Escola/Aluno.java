package Escola;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno(String name, String cpf, String matricula, String curso){
        super(name, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public final double calcularMensalidade(double valorBase){
        double taxaJuros = 0.05;
        double mensalidade = valorBase + (valorBase * taxaJuros);
        return mensalidade;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s%nMatricula No. %s%nCurso: %s%n", this.getName(), this.getMatricula(), this.getCurso());
    }
}
