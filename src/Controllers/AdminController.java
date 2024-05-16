package Controllers;

import Domain.Jogador;
import Model.JogadoresRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    public void valorTotalEquipa() throws FileNotFoundException {
        ArrayList<Jogador> listJogadors = JogadoresRepository.getInstance().getListJogadores();
        double valorTotal = 0;
        for(Jogador jogador: listJogadors) {
            valorTotal += jogador.getBuyValue();
        }
        System.out.println("\n\tValor total da equipa : " + valorTotal);
    }
    public void jogadorMaisCaro() throws FileNotFoundException {
        ArrayList<Jogador> listJogadors = JogadoresRepository.getInstance().getListJogadores();
        Jogador jogadormaisCaro = listJogadors.get(0);

        for (Jogador jogadorAtual: listJogadors) {
            if (jogadorAtual.getBuyValue() > jogadormaisCaro.getBuyValue()) {
                jogadormaisCaro = jogadorAtual;
            }
        }
        System.out.println("\t *** Jogador mais caro ****");
        System.out.println("\n\tJogador : " + jogadormaisCaro.toString());
    }

    public void jogadorMaisBarato() throws FileNotFoundException {
        ArrayList<Jogador> listJogadors = JogadoresRepository.getInstance().getListJogadores();
        Jogador jogadormaisBarato = listJogadors.get(0);

        for (Jogador jogadorAtual: listJogadors) {
            if (jogadorAtual.getBuyValue() < jogadormaisBarato.getBuyValue()) {
                jogadormaisBarato = jogadorAtual;
            }
        }
        System.out.println("\t *** Jogador mais Barato ****");
        System.out.println("\n\tJogador : " + jogadormaisBarato.toString());
    }
}
