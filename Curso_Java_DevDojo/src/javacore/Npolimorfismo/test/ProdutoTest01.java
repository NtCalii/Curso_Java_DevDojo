package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisão;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NIC10-i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisão tv = new Televisão("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
