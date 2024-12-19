package javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public String toString() {
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
