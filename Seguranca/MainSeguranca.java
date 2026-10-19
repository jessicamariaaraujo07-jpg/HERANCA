package Seguranca;

import java.util.Scanner;

public class MainSeguranca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

        while (!sistema.isAutenticado()) {

            System.out.print("Digite o usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo ao sistema!");
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
            }
        }

        System.out.println("\nVocê está autenticado.");
        System.out.print("Deseja fazer logout? (s/n): ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            sistema.logout();
        }

        sc.close();
    }
}