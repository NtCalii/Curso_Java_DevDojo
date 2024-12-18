package javacore.BintroduçãoMétodos.test;

import javacore.BintroduçãoMétodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divDoisNumeros(20.0, 2.0);
        System.out.println(result);
        System.out.println("-----------");
        calculadora.imprimeDivDoisNumeros(86.0, 0.0);
    }
}
