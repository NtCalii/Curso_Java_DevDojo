package javacore.BintroduçãoMétodos.test;

import javacore.BintroduçãoMétodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[]{1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(new int[]{1, 2, 3, 4, 5});
    }
}
