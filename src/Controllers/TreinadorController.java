package Controllers;

import Domain.Competicao;
import Domain.Jogador;
import Model.CompeticaoRepository;
import Model.JogadoresRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TreinadorController {
    public TreinadorController() {
    }

    public void rankingAtaqueDefesa() throws FileNotFoundException {
        ArrayList<Jogador> jogadoreslist = JogadoresRepository.getInstance().getListJogadores();
        for (Jogador jogador : jogadoreslist) {
            System.out.println("----------------------------------------------");
            System.out.println("Nome : " + jogador.getName());
            System.out.println("Ataque raking : " + jogador.getAttackRanking());
            System.out.println("Ataque defesa : " + jogador.getDefenseRanking());
        }
    }

    public void melhorDefesa() throws FileNotFoundException {
        int max = 0;
        String nome = "";
        ArrayList<Jogador> jogadoreslist = JogadoresRepository.getInstance().getListJogadores();

        for (Jogador jogador : jogadoreslist) {
            if (max < jogador.getDefenseRanking()) {
                max = jogador.getDefenseRanking();
                nome = jogador.getName();
            }
        }
        System.out.println(nome);

    }

    public void melhorAtaque() throws FileNotFoundException {
        int max = 0, count = 0;
        String nome = "";
        ArrayList<Jogador> jogadoreslist = JogadoresRepository.getInstance().getListJogadores();

        for (Jogador jogador : jogadoreslist) {
            if (max > jogador.getDefenseRanking() || count == 0) {

                max = jogador.getDefenseRanking();
                nome = jogador.getName();
                count++;

            }
        }
        System.out.println(nome);

    }

    public void competicoesAno(String ano) throws FileNotFoundException {
        ArrayList<Competicao> competionList = CompeticaoRepository.getInstance().getCompetionList();
        for (Competicao competion : competionList) {
            if (competion.getData().strip().split("-")[2].equals(ano)) {

                System.out.println(competion);
            }
        }
    }

    public void competicoesTodas() throws FileNotFoundException {
        ArrayList<Competicao> competionList = CompeticaoRepository.getInstance().getCompetionList();
        for (Competicao competion : competionList) {
            System.out.println(competion);

        }
    }
}
