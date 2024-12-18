package javacore.BintroduçãoMétodos.test;

import javacore.BintroduçãoMétodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finaliza a soma e começa a sub");
        calculadora.subTraiDoisNumeros();
    }
}
