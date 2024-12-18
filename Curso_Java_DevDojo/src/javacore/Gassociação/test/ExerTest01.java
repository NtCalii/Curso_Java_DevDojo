package javacore.Gassociação.test;

import javacore.Gassociação.dominio.ExerAluno;
import javacore.Gassociação.dominio.ExerLocal;
import javacore.Gassociação.dominio.ExerProfessor;
import javacore.Gassociação.dominio.ExerSeminario;

public class ExerTest01 {
    public static void main(String[] args) {
        ExerAluno aluno1 = new ExerAluno("Jotaro", 17);
        ExerAluno aluno2 = new ExerAluno("Diavolo", 32);
        ExerAluno aluno3 = new ExerAluno("Giorno", 15);
        ExerSeminario seminario1 = new ExerSeminario("JOJO Pose");
        ExerSeminario seminario2 = new ExerSeminario("Escola de Tokyo");
        ExerProfessor professor = new ExerProfessor("Gojo Sensei", "Feitiçaria");
        ExerLocal endereco = new ExerLocal("Av. Raymundo Dos Campos");
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario1);
        seminario1.setLocal(endereco);
        seminario2.setLocal(endereco);
        professor.setSeminario(seminario1, seminario2);
        seminario1.setAlunos(aluno1, aluno2, aluno3);
        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        System.out.println("-------------------");
        professor.imprime();
        System.out.println("-------------------");
        seminario1.imprime();
        seminario2.imprime();
    }
}
