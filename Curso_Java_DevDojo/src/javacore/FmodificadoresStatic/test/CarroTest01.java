package javacore.FmodificadoresStatic.test;

import javacore.FmodificadoresStatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280.0);
        Carro c2 = new Carro("Mercedes", 275.0);
        Carro c3 = new Carro("Audi", 290.0);
        Carro.setVelocidadeLimite(180.0);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
