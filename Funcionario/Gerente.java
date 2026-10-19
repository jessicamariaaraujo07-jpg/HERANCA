package Funcionario ;

public class Gerente implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Gerente bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente está trabalhando.");
    }

    public void fecharCaixa() {
        System.out.println("Gerente fechou o caixa.");
    }
}