package introdução.Exercicios;

public class EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        double salarioAnual = 70000.0;
        double primeiraFaixa = 0.09699999999999999;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.495;
        double valorImposto;
        if (salarioAnual <= 34712.0) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713.0 && salarioAnual <= 68507.0) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(valorImposto);
    }
}
