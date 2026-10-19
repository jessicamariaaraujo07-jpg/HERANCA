package Funcionario;

public class Faxineiro implements Funcionario {

    @Override
    public void baterPonto() {
        System.out.println("Faxineiro bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println("Faxineiro está trabalhando.");
    }

    public void solicitarMaterial() {
        System.out.println("Faxineiro solicitou material de limpeza.");
    }
}