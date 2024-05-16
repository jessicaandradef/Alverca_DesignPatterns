import Views.JogadorView;
import Views.LoginView;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int optionMain = -1;
        do {
            System.out.println("              .-'||'-.\n" +
                    "            .'   ||   '.\n" +
                    "           /   __||__   \\\n" +
                    "           | /`-    -`\\ |\n" +
                    "           | | 6    6 | |\n" +
                    "           \\/\\____7___/\\/\n" +
                    "   .--------:\\:I:II:I:/;--------.\n" +
                    "  /          \\`:I::I:`/          \\\n" +
                    " |            `------'            |\n" +
                    " |             \\____/             |\n" +
                    " |      ,     __   _____   ,      |\n" +
                    " |======|    / /  /  _  \\  |======|\n" +
                    " |======|   / /__ \\ <_> /  |======|\n" +
                    " |~~~~~|   | <_> \\/ <_> \\   |~~~~~|\n" +
                    " |     |\\   \\____/\\_____/  /|     |\n" +
                    "  \\    \\|                  |/    /\n" +
                    "  `\\    \\  _ _.-=\"\"=-._ _  /    /'\n" +
                    "    `\\   '`_)\\\\-++++-//(_`'   /'\n" +
                    "      ;   (__||      ||__)   ;\n" +
                    "       ;   ___\\      /___   ;\n" +
                    "        '. ---/-=..=-\\--- .'");
            System.out.println("\t**** Escolha o seu tipo de utilizador ****");
            System.out.println("\n");
            System.out.println("\t1. Jogador" +
                    "\n\t2. Treinador" +
                    "\n\t3. Admin" +
                    "\n\t0. Sair");
            try {
                optionMain = input.nextInt();
            } catch (InputMismatchException ex1) {
                optionMain = -1;
                input.next();
            }
            switch (optionMain) {
                case 1:
                    JogadorView viewJogador = new JogadorView();
                    viewJogador.menuJogador();
                    break;
                case 2:
                    LoginView loginView = new LoginView();
                    loginView.menuLogin(2);
                    optionMain = 0;
                    break;
                case 3:
                    LoginView loginView2 = new LoginView();
                    loginView2.menuLogin(3);
                    optionMain = 0;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n\tOpção Inválida!\n");
            }
        }while (optionMain != 0);
    }
}