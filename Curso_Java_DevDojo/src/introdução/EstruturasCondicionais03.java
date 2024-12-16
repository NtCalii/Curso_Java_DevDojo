package introdução;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000.0;
        String mensagemDoar = "Vou doar 500";
        String mensagemNaoDoar = "Não vou poder doar 500 ainda";
        String resultado = salario >= 5000.0 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
