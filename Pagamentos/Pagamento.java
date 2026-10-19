package Pagamentos;

public interface Pagamento {
    double calcularPagamento();
    String emitirRecibo();
}