package Controllers;

import Domain.Competicao;
import Domain.Jogador;
import Model.CompeticaoRepository;
import Model.JogadoresRepository;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class JogadorController {

    public JogadorController() {
    }

    public void showAllJogadores() throws FileNotFoundException {
        ArrayList<Jogador> listJogadores = JogadoresRepository.getInstance().getListJogadores();
        for(Jogador player: listJogadores){
            System.out.println(player);
        }
    }

    public void showAllCompetionWon() throws FileNotFoundException {
        ArrayList<Competicao> listCompetions = CompeticaoRepository.getInstance().getCompetionList();
        System.out.println("\n\t**** Competições Ganhas ****");
        for(Competicao competion : listCompetions){
            if (competion.getGolosAdversario() < competion.getGolosNossos()){
                System.out.println(competion);
            }
        }
    }
    public void showMostGoalsOnCompetion() throws FileNotFoundException {
        ArrayList<Competicao> listCompetions = CompeticaoRepository.getInstance().getCompetionList();
        int mostGoalsInOneCompetion = 0;
        for(Competicao competion : listCompetions){
            if (competion.getGolosNossos() > mostGoalsInOneCompetion){
                mostGoalsInOneCompetion = competion.getGolosNossos();
            }
        }
        System.out.println("\n\t**** Competições Com mais golos ****");
        for(Competicao competion : listCompetions){
            if (competion.getGolosNossos() == mostGoalsInOneCompetion){
                System.out.println(competion);
            }
        }
    }


}
