package javacore.Oscanner.test;

import java.util.Scanner;

public class VocêTest01 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = entrada.nextLine();
    System.out.println(entrada);
    System.out.print("DIgite sua idade: ");
    int idade = entrada.nextInt();
    System.out.println("-----------");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    entrada.close();
    }
}

