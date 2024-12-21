package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.serviço.RepositorioArquivo;
import javacore.Npolimorfismo.serviço.RepositorioBancoDeDados;
import javacore.Npolimorfismo.serviço.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioMemoria();
        Repositorio repositorio3 = new RepositorioArquivo();
        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
