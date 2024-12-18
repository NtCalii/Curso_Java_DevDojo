package javacore.Hherança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
        System.out.println("Dentro do bloco de inicialização construtor funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + "recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
}
