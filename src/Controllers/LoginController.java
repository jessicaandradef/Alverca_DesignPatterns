package Controllers;

import Domain.Admin;
import Domain.Treinador;
import Domain.Utilizador;
import Model.AdminRepository;
import Model.TreinadorRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LoginController {

    public LoginController() {
    }

    public boolean autenticaçãoLogin(String username, String password, int tipoUtilizador) throws FileNotFoundException {

        //para ter o array de utilizadores;
        ArrayList<Utilizador> admins = AdminRepository.getInstance().getListAdm();
        ArrayList<Utilizador> treinadores = TreinadorRepository.getInstance().getTreinadorArray();

        if(tipoUtilizador == 2){
            for (Utilizador treinador : treinadores){
                if (treinador instanceof Treinador) {
                    if (treinador.getNome().equals(username) && treinador.getSenha().equals(password)){
                        return true;
                    }
                }
            }
        } else if (tipoUtilizador == 3) {
            for (Utilizador admin : admins) {
                if (admin instanceof Admin) {
                    if (admin.getNome().equals(username) && admin.getSenha().equals(password)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
