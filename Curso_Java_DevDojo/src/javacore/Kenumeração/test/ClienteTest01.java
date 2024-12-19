package javacore.Kenumeração.test;

import javacore.Kenumeração.dominio.Cliente;
import javacore.Kenumeração.dominio.TipoCliente;
import javacore.Kenumeração.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CRÉDITO);
        Cliente cliente2 = new Cliente("Naruto", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DÉBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DÉBITO.calcularDesconto(100.0));
        System.out.println(TipoPagamento.CRÉDITO.calcularDesconto(100.0));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
