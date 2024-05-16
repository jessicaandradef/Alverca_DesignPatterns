package Model;

import Domain.Competicao;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CompeticaoRepository {

    private static CompeticaoRepository competionRepository;
    private ArrayList<Competicao> competionList;

    private CompeticaoRepository() throws FileNotFoundException {
        this.competionList = CSVReader.readCompetionsFile("files/competicoes.csv");
    }

    public static CompeticaoRepository getInstance() throws FileNotFoundException {
        if(competionRepository==null){
            competionRepository=new CompeticaoRepository();
        }
        return competionRepository;
    }

    public ArrayList<Competicao> getCompetionList() {
        return competionList;
    }
}
