package Pagamentos;

public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor + (valor * 0.05);
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento com cartão\n"
                + "Valor original: R$ " + String.format("%.2f", valor) + "\n"
                + "Taxa de 5% aplicada\n"
                + "Valor final: R$ " + String.format("%.2f", calcularPagamento());
    }
}