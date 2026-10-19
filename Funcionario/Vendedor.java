package Funcionario;

public class Vendedor implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Vendedor bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Vendedor está trabalhando.");
    }

    public void realizarVenda() {
        System.out.println("Vendedor realizou uma venda.");
    }
}