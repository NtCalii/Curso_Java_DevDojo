package javacore.Oscanner.test;

import java.util.Scanner;

public class SuaIdade01 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.print("Digite seu ano de nascença: ");
        int anoDeNascença = idade.nextInt();
        System.out.println(" ");
        System.out.print("Digite o ano em que estamos: ");
        int anoAtual = idade.nextInt();
        System.out.println(" ");

        int suaIdade = anoAtual - anoDeNascença;
        System.out.println("Sua idade é: " + suaIdade);
        idade.close();
    }
}
