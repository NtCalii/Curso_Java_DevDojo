package javacore.Gassociação.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (this.jogadores != null) {
            Jogador[] var1 = this.jogadores;
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Jogador jogador = var1[var3];
                System.out.println(jogador.getNome());
            }

        }
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
