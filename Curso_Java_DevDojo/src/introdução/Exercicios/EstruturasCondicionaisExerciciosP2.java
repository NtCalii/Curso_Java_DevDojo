package introdução.Exercicios;

public class EstruturasCondicionaisExerciciosP2 {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
            case 1 -> System.out.println("Final de Semana");
            case 2 -> System.out.println("Dia Útil");
            case 3 -> System.out.println("Dia Útil");
            case 4 -> System.out.println("Dia Útil");
            case 5 -> System.out.println("Dia Útil");
            case 6 -> System.out.println("Dia Útil");
            case 7 -> System.out.println("Final de Semana");
            default -> System.out.println("Opação invalida");
        }
    }
}
