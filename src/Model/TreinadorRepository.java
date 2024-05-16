package Model;

import Domain.Utilizador;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TreinadorRepository {
    private static TreinadorRepository instance;
    private ArrayList<Utilizador> treinadorArray;

    private TreinadorRepository() throws FileNotFoundException {
        this.treinadorArray = CSVReader.readLoginFile("Files/login_alverca.csv");
    }

    public static TreinadorRepository getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new TreinadorRepository();
        }
        return instance;
    }

    public ArrayList<Utilizador> getTreinadorArray() {
        return treinadorArray;
    }
}
