package introdução.Exercicios;

public class EstruturasDeRepeticaoExerciciosP2 {
    public static void main(String[] args) {
        double valorTotal = 30000.0;

        for(int parcela = 1; (double)parcela <= valorTotal; ++parcela) {
            double valorParcela = valorTotal / (double)parcela;
            if (!(valorParcela >= 1000.0)) {
                break;
            }

            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
