package javacore.FmodificadoresStatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        int[] var1 = episodios;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int episodio = var1[var3];
            System.out.print("" + episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    static {
        System.out.println("Bloco de inicialilzação 1");
        episodios = new int[50];

        for(int i = 0; i < episodios.length; ++i) {
            episodios[i] = i + 1;
        }

        System.out.println("Bloco de inicialilzação 2");
        System.out.println("Bloco de inicialilzação 3");
    }
}
