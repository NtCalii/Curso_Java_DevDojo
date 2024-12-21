package javacore.Npolimorfismo.serviço;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando o banco de dados");
    }
}
