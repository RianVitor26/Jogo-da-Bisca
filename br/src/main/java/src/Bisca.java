package src;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// import main.java.src.TesteErro;

import java.util.Random;
import java.util.List;

public class Bisca{
    public static void main(String[] args) {

        // TesteErro jenkinsError = new TesteErro();
        // jenkinsError.gerando_erro();

        Map<String, Integer> value = new TreeMap<>();
        value.put("2", 0);
        value.put("3", 0);
        value.put("4", 0);
        value.put("5", 0);
        value.put("6", 0);
        value.put("Q", 2);
        value.put("J", 3);
        value.put("K", 4);
        value.put("A", 11);
        value.put("7", 10);

        String[] nipes = { " Copas", " Espada", " Ouros", " Paus" };
        List<String> cartas = new ArrayList<String>();
        String carta;
        for (int i = 0; i < 4; i++) {
            for (String key : value.keySet()) {
                carta = (key + nipes[i]);
                cartas.add(carta);
            }
        }

        List<String> Jogador1 = new ArrayList<>();

        /// método inicia game
        Random rand = new Random();
        for (int j = 0; j < 3; j++) {
            String carta_jogador = cartas.get(rand.nextInt(cartas.size()));
            Jogador1.add(carta_jogador);
            cartas.remove(carta_jogador);
        }

        List<String> Jogador2 = new ArrayList<>();

        for (int j = 0; j < 3; j++) {
            String carta_jogador = cartas.get(rand.nextInt(cartas.size()));
            Jogador2.add(carta_jogador);
            cartas.remove(carta_jogador);
        }

        int rodada = 1;
        /// Classe random
        Random jogada = new Random();
        int jogada_1 = jogada.nextInt(2);
        int jogada_2 = jogada.nextInt(2);
        String trunfo = cartas.get(rand.nextInt(cartas.size()));
        /// Iniciando Jogo
        /// selecionando nipe do jogo
        System.out.println("BEM VINDO AO JOGO DE BISCA!!!!!!");
        System.out.println("Carta Trunfo:" + trunfo);
        /// System.out.println("(1) Bater Copas(2X pontos) (2) Cortar Nipe ");
        /// Classe Game
        for (int x = 0; x < 17; x++) {
            System.out.println("Rodada " + rodada);
            System.out.println("*********************************************");
            System.out.println("Cartas Jogador 1: " + Jogador1);
            System.out.println("Cartas Jogador 2: " + Jogador2);
            System.out.println("*********************************************");
            System.out.println("Jogada do Jogador_1: " + Jogador1.get(jogada_1));
            Jogador1.remove(Jogador1.get(jogada_1));
            System.out.println("Jogada do Jogador_2: " + Jogador2.get(jogada_2));
            Jogador2.remove(Jogador2.get(jogada_2));
            String c1 = cartas.get(rand.nextInt(cartas.size()));
            Jogador1.add(c1);
            cartas.remove(c1);
            String c2 = cartas.get(rand.nextInt(cartas.size()));
            Jogador2.add(c2);
            cartas.remove(c2);
            System.out.println("*********************************************");
            /// System.out.println(cartas);
            rodada++;
            for(int z = 17; z < 20; z++){
                System.out.println("Rodada " + rodada);
                System.out.println("*********************************************");
                System.out.println("Cartas Jogador 1: " + Jogador1);
                System.out.println("Cartas Jogador 2: " + Jogador2);
                System.out.println("*********************************************");
                System.out.println("Jogada do Jogador_1: " + Jogador1.get(jogada_1));
                Jogador1.remove(Jogador1.get(jogada_1));
                System.out.println("Jogada do Jogador_2: " + Jogador2.get(jogada_2));
                Jogador2.remove(Jogador2.get(jogada_2));
                System.out.println("*********************************************");
                rodada++;
            if (rodada == 20) {
                jogada_1 = 0;
                jogada_2 = 0;
                }
            }
        }

    }

}
