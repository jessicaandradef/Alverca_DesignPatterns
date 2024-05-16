package Views;

import Controllers.LoginController;
import Domain.Utilizador;
import Model.TreinadorRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginView {

    public LoginView() {
    }

    public void menuLogin(int escolha) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        LoginController newLoginController = new LoginController();
        boolean loginValid = false;
        do {
            System.out.println("Digite o USERNAME: ");
            username = input.next();
            System.out.println("Digite a PASSWORD ");
            password = input.next();
            System.out.println();
            boolean verificacao = newLoginController.autenticaçãoLogin(username,password, escolha);

            if (!verificacao) {
                System.out.println("Login Invalido; ");
                loginValid = false;
                break;
            } else {
                loginValid = true;
                if (escolha == 2){ //escolha de TREINADOR;
                    TreinadorView viewTeinador = new TreinadorView();
                    viewTeinador.menuTreinador();
                    break;
                } else if (escolha == 3) { //escolha ADMIN;
                    AdminView admin = new AdminView();
                    admin.menuAdmin();
                    break;
                }
            }
        }while (!loginValid);

    }
}
