package javacore.BintroduçãoMétodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(20);
    }

    public void subTraiDoisNumeros() {
        System.out.println(15);
    }

    public void multDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void imprimeDivDoisNumeros(double num1, double num2) {
        if (num2 == 0.0) {
            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        int[] var3 = numeros;
        int var4 = numeros.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarargs(int... numeros) {
        int soma = 0;
        int[] var3 = numeros;
        int var4 = numeros.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            soma += num;
        }

        System.out.println(soma);
    }
}
