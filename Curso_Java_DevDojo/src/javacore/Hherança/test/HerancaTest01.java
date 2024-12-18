package javacore.Hherança.test;

import javacore.Hherança.dominio.Endereco;
import javacore.Hherança.dominio.Funcionario;
import javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCEP("012345-209");
        Pessoa pessoa = new Pessoa("Rick");
        pessoa.setCPF("09988765-1");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Baki da Silva");
        funcionario.setCPF("12345667-2");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500.0);
        System.out.println("--------------");
        funcionario.imprime();
    }
}
