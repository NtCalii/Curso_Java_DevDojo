package javacore.Gassociação.test;

import javacore.Gassociação.dominio.Jogador;
import javacore.Gassociação.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2};
        jogador1.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("--- Jogador ---");
        jogador1.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
