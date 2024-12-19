package javacore.JmodificadorFinal.test;

import javacore.JmodificadorFinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(250.0);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Krilin");
        System.out.println(carro.COMPRADOR);
    }
}
