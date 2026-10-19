package Funcionario ;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();

        gerente.baterPonto();
        gerente.trabalhar();
        gerente.fecharCaixa();

        System.out.println();

        vendedor.baterPonto();
        vendedor.trabalhar();
        vendedor.realizarVenda();

        System.out.println();

        faxineiro.baterPonto();
        faxineiro.trabalhar();
        faxineiro.solicitarMaterial();
    }
}