package Pagamentos;

public class PagamentoDinheiro implements Pagamento {

    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor - (valor * 0.10);
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento em dinheiro\n"
                + "Valor original: R$ " + String.format("%.2f", valor) + "\n"
                + "Desconto de 10% aplicado\n"
                + "Valor final: R$ " + String.format("%.2f", calcularPagamento());
    }
}