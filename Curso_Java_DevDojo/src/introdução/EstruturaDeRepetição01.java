package introdução;

public class EstruturaDeRepetição01 {
    public static void main(String[] args) {
        int cont = 0;

        while(cont < 10) {
            ++cont;
            System.out.println(cont);
        }

        cont = 0;

        do {
            ++cont;
            System.out.println("Dentro do do-while " + cont);
        } while(cont < 10);

        for(int i = 1; i <= 10; ++i) {
            System.out.println("For é " + i);
        }
    }
}
