package javacore.ParrayList.test;

import java.util.ArrayList;
import java.util.List;

public class UserTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Goku"); //indice 0
        nomes.add("Vegeta"); //indice 1
        nomes.add("Pedro"); //indice 2
        nomes.add("Freeza"); //indice 3
        nomes.add("Majin Boo"); //indice 4

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("/////////////////////");

        nomes.remove(2);
        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("/////////////////////");


        System.out.println(nomes.get(2));
    }
}
