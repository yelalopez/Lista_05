package Escola;

public final class Bolsista extends Aluno{
    private Double valorBolsa;

    public Bolsista(String name, String cpf, String matricula, String curso, Double valorBolsa){
        super(name, cpf, matricula, curso);
        this.valorBolsa = valorBolsa;
    }

}
