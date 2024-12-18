package javacore.Gassociação.test;
import javacore.Gassociação.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Jogador[] var5 = jogadores;
        int var6 = jogadores.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Jogador jogador = var5[var7];
            jogador.imprime();
        }
    }
}
