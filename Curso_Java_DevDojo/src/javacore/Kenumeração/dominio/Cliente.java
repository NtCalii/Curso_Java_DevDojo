package javacore.Kenumeração.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String toString() {
        String var10000 = this.nome;
        return "Cliente{nome='" + var10000 + "', tipoCliente=" + String.valueOf(this.tipoCliente) + ", tipoClienteInt=" + this.tipoCliente.VALOR + ", tipoPagamento=" + String.valueOf(this.tipoPagamento) + "}";
    }
}
