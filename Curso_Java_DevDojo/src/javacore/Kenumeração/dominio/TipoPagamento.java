package javacore.Kenumeração.dominio;

public enum TipoPagamento {
    DÉBITO {
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CRÉDITO {
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    private TipoPagamento() {
    }

    public abstract double calcularDesconto(double var1);
}