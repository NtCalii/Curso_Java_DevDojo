package javacore.Hherança.dominio;

import java.io.PrintStream;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
        System.out.println("Dentro do bloco de inicialização do construtor pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.CPF);
        PrintStream var10000 = System.out;
        String var10001 = this.endereco.getRua();
        var10000.println(var10001 + " " + this.endereco.getCEP());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
}
