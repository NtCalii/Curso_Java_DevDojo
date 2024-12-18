package javacore.EblocosDeInicialização.test;
import javacore.EblocosDeInicialização.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piace");
        int[] var2 = anime.getEpisodios();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int episodio = var2[var4];
            System.out.print("" + episodio + " ");
        }
    }
}
