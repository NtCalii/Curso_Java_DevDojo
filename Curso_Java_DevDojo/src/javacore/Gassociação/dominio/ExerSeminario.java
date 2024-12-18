package javacore.Gassociação.dominio;

public class ExerSeminario {
    private String titulo;
    private ExerLocal local;
    private ExerAluno[] alunos;

    public ExerSeminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        String var10001 = this.titulo;
        System.out.println(var10001 + ", " + this.local.getEndereco());
        System.out.println("Alunos: ");
        if (this.alunos != null) {
            ExerAluno[] var1 = this.alunos;
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ExerAluno aluno = var1[var3];
                if (aluno != null) {
                    System.out.println(aluno.getNome());
                }
            }
        } else {
            System.out.println("Sem alunos.");
        }

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ExerLocal getLocal() {
        return this.local;
    }

    public void setLocal(ExerLocal local) {
        this.local = local;
    }

    public ExerAluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ExerAluno[] alunos) {
        this.alunos = alunos;
    }

    public void setAlunos(ExerAluno aluno3, ExerAluno aluno2, ExerAluno aluno1) {
        this.alunos = new ExerAluno[3];
        this.alunos[0] = aluno3;
        this.alunos[1] = aluno2;
        this.alunos[2] = aluno1;
    }
}
