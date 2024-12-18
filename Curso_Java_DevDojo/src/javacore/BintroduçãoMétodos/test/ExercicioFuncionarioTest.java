package javacore.BintroduçãoMétodos.test;

import javacore.BintroduçãoMétodos.dominio.ExercicioFuncionario;

public class ExercicioFuncionarioTest {
    public static void main(String[] args) {
        ExercicioFuncionario funcionario01 = new ExercicioFuncionario();
        funcionario01.setNome("Tomioka");
        funcionario01.setIdade(21);
        funcionario01.setSalarios(new double[]{1200.0, 987.32, 2000.0});
        funcionario01.imprime();
        funcionario01.imprimeMediaSalario();
    }
}
