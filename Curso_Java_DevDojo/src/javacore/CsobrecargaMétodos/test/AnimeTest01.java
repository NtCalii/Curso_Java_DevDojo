package javacore.CsobrecargaMétodos.test;

import javacore.CsobrecargaMétodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Jujutsu Kaisen 2 temp", "Tv", 24, "Shounen");
        anime.imprime();
    }
}
