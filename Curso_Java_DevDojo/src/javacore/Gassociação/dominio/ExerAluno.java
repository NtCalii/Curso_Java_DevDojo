package javacore.Gassociação.dominio;

public class ExerAluno {
    private String nome;
    private int idade;
    private ExerSeminario seminario;

    public ExerAluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("\n");
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getTitulo());
        } else {
            System.out.println("Seminário: Nenhum seminário");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ExerSeminario getSeminario() {
        return this.seminario;
    }

    public void setSeminario(ExerSeminario seminario) {
        this.seminario = seminario;
    }
}
