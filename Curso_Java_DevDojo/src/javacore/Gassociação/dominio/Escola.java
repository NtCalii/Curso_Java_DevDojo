package javacore.Gassociação.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (this.professores != null) {
            Professor[] var1 = this.professores;
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                Professor professor = var1[var3];
                System.out.println(professor.getNome());
            }

        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return this.professores;
    }

    public void setProfessor(Professor[] professor) {
        this.professores = professor;
    }
}
