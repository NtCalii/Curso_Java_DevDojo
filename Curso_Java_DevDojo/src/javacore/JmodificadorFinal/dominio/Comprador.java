package javacore.JmodificadorFinal.dominio;

public class Comprador {
    private String nome;

    public Comprador() {
    }

    public String toString() {
        return "Comprador{nome='" + this.nome + "'}";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
