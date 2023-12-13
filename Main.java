import Escola.*;

public class Main {
    public static void main(String[] args) {
        Funcionario professora = new Professor("Pepita Perez", "123-456-789-00", "1172", 7500.00, "Programação Orientada a Objetos");
        Funcionario atendente = new Atendente("Sofia Almeida", "234-567-890-01", "728", 4500.00, "Design");

        professora.exibirDados();
        professora.increaseSalary();

        System.out.println("--------------");
        atendente.exibirDados();
        atendente.calcularSalario(40, 150.00);
        System.out.println(atendente.getSalary());

        Aluno estudante1 = new Aluno("Carmen Pelaez", "345-678-912-34", "91234", "Ciencias da Computação");
        Aluno estudante2 = new Bolsista("Eva Miranda", "456-789-012-34", "01234", "Design", 1500.00);
        System.out.println("--------------");
        estudante1.exibirDados();
        System.out.println(estudante1.calcularMensalidade(1000));

        System.out.println("--------------");
        estudante2.exibirDados();
        System.out.println(estudante2.getCpf());

    }
}

