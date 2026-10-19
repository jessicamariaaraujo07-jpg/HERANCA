package Pagamentos;

public class MainPagamento {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(100.00);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(100.00);

        System.out.println("=== PAGAMENTO COM CARTÃO ===");
        System.out.println(cartao.emitirRecibo());

        System.out.println();

        System.out.println("=== PAGAMENTO EM DINHEIRO ===");
        System.out.println(dinheiro.emitirRecibo());
    }
}