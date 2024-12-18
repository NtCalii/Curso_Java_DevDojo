package javacore.EblocosDeInicialização.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime(String nome) {
        System.out.println("Bloco de inicialilzação");
        this.episodios = new int[50];

        for(int i = 0; i < this.episodios.length; ++i) {
            this.episodios[i] = i + 1;
        }

        this.nome = nome;
    }

    public Anime() {
        System.out.println("Bloco de inicialilzação");
        this.episodios = new int[50];

        for(int i = 0; i < this.episodios.length; ++i) {
            this.episodios[i] = i + 1;
        }

        int[] var5 = this.episodios;
        int var2 = var5.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int episodio = var5[var3];
            System.out.print("" + episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
