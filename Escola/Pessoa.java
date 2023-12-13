package Escola;

public abstract class Pessoa {
    private String name;
    private String cpf;

    public Pessoa(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public abstract void exibirDados();

    public String getName(){
        return this.name;
    }
    public String getCpf() {
        return this.cpf;
    }
}
