package javacore.Gassociação.test;

import javacore.Gassociação.dominio.Escola;
import javacore.Gassociação.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Gojo Sensei");
        Professor[] professores = new Professor[]{professor1, professor2};
        Escola escola = new Escola("Tokyo Konoha", professores);
        escola.imprime();
    }
}
