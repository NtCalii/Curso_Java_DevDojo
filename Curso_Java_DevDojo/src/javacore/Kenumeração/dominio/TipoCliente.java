package javacore.Kenumeração.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String nomeRelatorio;

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        TipoCliente[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TipoCliente tipoCliente = var1[var3];
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public String getNomeRelatorio() {
        return this.nomeRelatorio;
    }

    private TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
}
