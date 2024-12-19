package javacore.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250.0;
    public final Comprador COMPRADOR = new Comprador();

    public Carro() {
    }

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
