package javacore.Gassociação.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        if (this.time != null) {
            System.out.println(this.time.getNome());
        }

    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
