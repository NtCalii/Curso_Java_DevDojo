package javacore.Gassociação.dominio;

public class ExerProfessor {
    private String nome;
    private String especialidade;
    private ExerSeminario[] seminario;

    public ExerProfessor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = new ExerSeminario[2];
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome + " Especialidade: " + this.especialidade);
        if (this.seminario != null) {
            System.out.print("Seminários: ");
            ExerSeminario[] var1 = this.seminario;
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ExerSeminario sem = var1[var3];
                if (sem != null) {
                    System.out.print(sem.getTitulo() + " ");
                }
            }

            System.out.println();
        } else {
            System.out.println("Nenhum seminário atribuído.");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ExerSeminario[] getSeminario() {
        return this.seminario;
    }

    public void setSeminario(ExerSeminario seminario1, ExerSeminario seminario2) {
        this.seminario = new ExerSeminario[2];
        this.seminario[0] = seminario1;
        this.seminario[1] = seminario2;
    }
}
