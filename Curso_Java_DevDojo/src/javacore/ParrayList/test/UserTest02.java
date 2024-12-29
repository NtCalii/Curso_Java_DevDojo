package javacore.ParrayList.test;

import javacore.ParrayList.dominio.PessoaLista;

import java.util.ArrayList;
import java.util.List;

public class UserTest02 {
    public static void main(String[] args) {
//        Wrapper Class:
//        int = Integer
//        float = Float
//        double = Double
//        char = Character
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(19);

        PessoaLista joao = new PessoaLista(23, "João");
        PessoaLista maria = new PessoaLista(39, "Maria");
        PessoaLista nathan = new PessoaLista(19, "Nathan");

        List<PessoaLista> pessoas = new ArrayList<PessoaLista>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(nathan);
        pessoas.add(new PessoaLista(18, "Maki"));

        for (PessoaLista pessoa: pessoas){
            System.out.println(pessoa.getNome());
        }
    }
}
