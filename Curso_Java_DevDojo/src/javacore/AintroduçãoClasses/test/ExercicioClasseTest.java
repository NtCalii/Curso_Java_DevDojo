package javacore.AintroduçãoClasses.test;

import javacore.AintroduçãoClasses.dominio.ExercicioClasse;

public class ExercicioClasseTest {
    public static void main(String[] args) {
        ExercicioClasse exerciciosClasses = new ExercicioClasse();
        ExercicioClasse exerciciosClasses2 = new ExercicioClasse();
        exerciciosClasses.nome = "Mercedes Altus";
        exerciciosClasses.cor = "Azul";
        exerciciosClasses.ano = 2019;
        exerciciosClasses2.nome = "Gol Bola";
        exerciciosClasses2.cor = "Preto";
        exerciciosClasses2.ano = 2010;
        System.out.println(exerciciosClasses.nome + " " + exerciciosClasses.cor + " " + exerciciosClasses.ano);
        System.out.println(exerciciosClasses2.nome + " " + exerciciosClasses2.cor + " " + exerciciosClasses2.ano);
    }
}
