package javacore.Dconstrutores.test;

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen", "Tv", 24, "shounen", "MAPPA");
        Anime anime2 = new Anime();
        anime.imprime();
        System.out.println("----------------");
        anime2.imprime();
    }
}
