package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {
    public void menuAdmin() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;
        AdminController controlador = new AdminController();

        do {
            System.out.println("\n***** ADMIN *****\n");
            System.out.println("1. Consultar o valor total da equipa");
            System.out.println("2. Consultar qual o jogador mais caro");
            System.out.println("3. Consultar qual o jogador mais barato");
            System.out.println("4. Sair");
            System.out.print("\nInsira uma opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    controlador.valorTotalEquipa();
                    break;
                case 2:
                    controlador.jogadorMaisCaro();
                    break;
                case 3: //sair
                    controlador.jogadorMaisBarato();
                    break;
                case 4: //sair
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }while (opcao != 4);
    }
}
