package game;

import java.util.Scanner;
import game.Jogo.Jogadas;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo;

        try {
            System.out.println("Bem vindo ao Jokempô!");

            System.out.println("Digite seu nome:");
            Jogador jogador = new Jogador(scanner.nextLine());

            do {
                System.out.println("Deseja jogar com a maquina ou com outro jogador?");
                System.out.println("1 - Maquina");
                System.out.println("2 - Outro jogador");
                int opcaoDeJogo = scanner.nextInt();

                if (opcaoDeJogo < 1 || opcaoDeJogo > 2) {
                    System.out.println("Opção inválida");
                    continue;
                }

                System.out.println("Qual sua jogada ?");
                System.out.println("1 - Pedra");
                System.out.println("2 - Papel");
                System.out.println("3 - Tesoura");

                jogador.Jogada = Jogadas.fromInteger(scanner.nextInt());

                if (jogador.Jogada == null) {
                    System.out.println("Opção inválida");
                    continue;
                }

                jogo = new Jogo(opcaoDeJogo);
                jogo.ExecutarRodada(jogador);

            } while (jogador.Jogada == null);

        } finally {
            scanner.close();
        }
    }
}
