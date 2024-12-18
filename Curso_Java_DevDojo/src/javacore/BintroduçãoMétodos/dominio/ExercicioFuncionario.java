package javacore.BintroduçãoMétodos.dominio;

public class ExercicioFuncionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        double[] var1 = this.salarios;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            double salario = var1[var3];
            System.out.print("" + salario + " / ");
        }

    }

    public void imprimeMediaSalario() {
        double[] var1 = this.salarios;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            double salario = var1[var3];
            this.media += salario;
        }

        this.media /= (double)this.salarios.length;
        System.out.println("\nMédia Salarial: " + this.media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public double getMedia() {
        return this.media;
    }
}
