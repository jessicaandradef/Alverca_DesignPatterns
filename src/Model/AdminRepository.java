package Model;

import Domain.Utilizador;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminRepository {
    private static AdminRepository instance;
    private ArrayList<Utilizador> adminArray;

    private AdminRepository() throws FileNotFoundException {
        this.adminArray = CSVReader.readLoginFile("Files/login_alverca.csv");
    }

    public static AdminRepository getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new AdminRepository();
        }
        return instance;
    }

    public ArrayList<Utilizador> getListAdm() {
        return adminArray;
    }
}
