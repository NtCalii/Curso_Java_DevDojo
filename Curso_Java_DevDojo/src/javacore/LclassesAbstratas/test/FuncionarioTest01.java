package javacore.LclassesAbstratas.test;

import javacore.LclassesAbstratas.dominio.Desenvolvedor;
import javacore.LclassesAbstratas.dominio.Funcionario;
import javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Light", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
