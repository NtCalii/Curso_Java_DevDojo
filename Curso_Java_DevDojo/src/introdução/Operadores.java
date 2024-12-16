package introdução;

public class Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        double numero02 = 20.0;
        System.out.println((double)numero01 / numero02);
        int resto = 1;
        System.out.println(resto);
        boolean isDezMaiorQueVinte = false;
        boolean isVinteIgualQueVinte = true;
        boolean isDezDiferenteQueVinte = true;
        boolean isDezMaiorIgualQueVinte = false;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isVinteIgualQueVinte " + isVinteIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);
        System.out.println("isDezMaiorIgualQueVinte " + isDezMaiorIgualQueVinte);
        int idade = 35;
        int idade2 = 29;
        float salario = 3500.0F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612.0F;
        boolean isDentroDaLeiMenorQueTrinta = idade2 <= 30 && salario >= 3381.0F;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        double ValorTotalContaCorrente = 200.0;
        double ValorTotalContaPoupanca = 10000.0;
        boolean isPlayCincoCompravel = ValorTotalContaCorrente >= 5000.0 || ValorTotalContaPoupanca >= 5000.0;
        System.out.println("Comprar Play5 " + isPlayCincoCompravel);
        double bonus = 1800.0;
        bonus += 1000.0;
        System.out.println(bonus);
        int contador = 0;
        ++contador;
        System.out.println(contador);
    }
}
