package Tools;

import Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    /**
     * Method to read the "jogadores" file and create all Jogadores
     * @param path Path of the file
     * @return ArrayList with all Jogadores
     * @throws FileNotFoundException
     */
    public static ArrayList<Jogador> readJogadoresFile(String path) throws FileNotFoundException {
        ArrayList<Jogador> jogadorArray = new ArrayList<Jogador>();
        File jogadoresFile = new File(path);
        Scanner scannerFile = new Scanner(jogadoresFile);
        scannerFile.nextLine();
        while (scannerFile.hasNextLine()){
            String[] jogadorLine = scannerFile.nextLine().split(";");
            Jogador newJogador = new Jogador(Integer.parseInt(jogadorLine[0]), jogadorLine[1], Integer.parseInt(jogadorLine[2]), jogadorLine[3], Integer.parseInt(jogadorLine[4]), Integer.parseInt(jogadorLine[5]), Double.parseDouble(jogadorLine[6]));
            jogadorArray.add(newJogador);
        }
        return jogadorArray;
    }

    /**
     * Method to read the "Competiçoes" file and create all Competiçoes
     * @param path Path of the file
     * @return ArrayList with all Competições
     * @throws FileNotFoundException
     */
    public static ArrayList<Competicao> readCompetionsFile(String path) throws FileNotFoundException {

        File salesFile = new File(path);
        Scanner sc = new Scanner(salesFile);
        ArrayList<Competicao> competionList = new ArrayList<Competicao>();
        sc.nextLine();
        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            String[] splitLine = line.split(";");

            String data = splitLine[0];
            String competicao = splitLine[1];
            String adversario = splitLine[2];
            int golosNossos = Integer.parseInt(splitLine[3]);
            int golosadversario = Integer.parseInt(splitLine[3]);

            Competicao newCompetion = new Competicao(data, competicao, adversario, golosNossos, golosadversario);

            competionList.add(newCompetion);
        }

        return competionList;
    }

    public static ArrayList<Utilizador> readLoginFile(String path) throws FileNotFoundException {

        System.out.println("Ler ficheiro");

        File loginFile = new File(path);
        Scanner sc = new Scanner(loginFile);
        ArrayList<Utilizador> userArray = new ArrayList<Utilizador>();
        sc.nextLine();

        while (sc.hasNextLine()) {

            String line = sc.nextLine();
            String[] splitLine = line.split(";");

            String tipoConta = splitLine[0];
            String utilizador = splitLine[1];
            String senha = splitLine[2];

            Utilizador newUser = null;

            if (tipoConta.equalsIgnoreCase("TREIN")){
                newUser = new Treinador(utilizador,senha, tipoConta);
            } else if (tipoConta.equalsIgnoreCase("ADMIN")) {
                newUser = new Admin(utilizador,senha,tipoConta);
            }
            userArray.add(newUser);
        }

        return userArray;

    }

}
