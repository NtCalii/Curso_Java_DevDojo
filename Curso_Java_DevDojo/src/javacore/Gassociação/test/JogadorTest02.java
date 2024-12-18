package javacore.Gassociação.test;

import javacore.Gassociação.dominio.Jogador;
import javacore.Gassociação.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador1.imprime();
        jogador2.imprime();
    }
}
