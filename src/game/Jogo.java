package game;

import java.util.Random;

public class Jogo {
    private final OpcaoDeJogo opcaoDeJogo;
    private final int numeroDeJogadores = 2;
    private Jogador Jogadores[] = new Jogador[numeroDeJogadores];

    public Jogo(int opcaoJogo) {
        this.opcaoDeJogo = OpcaoDeJogo.fromInteger(opcaoJogo);
    }

    public void ExecutarRodada(Jogador jogador) {
        this.Jogadores[0] = jogador;

        if (opcaoDeJogo.equals(OpcaoDeJogo.Maquina)) {
            System.out.println(calcularResultadoPlayerVsMaquina());
        } else {
            System.out.println(calcularResultadoPlayerVsPlayer());
        }
    }

    // Função que gera o resultado do jogador contra a maquina
    private String calcularResultadoPlayerVsMaquina() {
        IniciarJogadaMaquina();

        Jogador jogador1 = Jogadores[0];
        Jogador jogador2 = Jogadores[1];

        if (jogador1.Jogada.equals(jogador2.Jogada)) {
            return "Essa rodada empatou";
        } else if (Jogadas.Tesoura.equals(jogador1.Jogada) && Jogadas.Papel.equals(jogador2.Jogada)) {
            return "O jogador(a) " + jogador1.getNome() + " ganhou cortando o papel do(a) " + jogador2.getNome();
        } else if (Jogadas.Pedra.equals(jogador1.Jogada) && Jogadas.Tesoura.equals(jogador2.Jogada)) {
            return "O jogador(a) " + jogador1.getNome() + " ganhou quebrando a Tesoura do(a) " + jogador2.getNome();
        } else if (Jogadas.Papel.equals(jogador1.Jogada) && Jogadas.Pedra.equals(jogador2.Jogada)) {
            return "O jogador(a) " + jogador1.getNome() + " ganhou Embrulhando a pedra do(a) " + jogador2.getNome();
        } else if (Jogadas.Tesoura.equals(jogador2.Jogada) && Jogadas.Papel.equals(jogador1.Jogada)) {
            return "O jogador(a) " + jogador2.getNome() + " ganhou cortando o papel do(a) " + jogador1.getNome();
        } else if (Jogadas.Pedra.equals(jogador2.Jogada) && Jogadas.Tesoura.equals(jogador1.Jogada)) {
            return "O jogador(a) " + jogador2.getNome() + " ganhou quebrando a Tesoura do(a) " + jogador1.getNome();
        } else if (Jogadas.Papel.equals(jogador2.Jogada) && Jogadas.Pedra.equals(jogador1.Jogada)) {
            return "O jogador(a) " + jogador2.getNome() + " ganhou Embrulhando a pedra do(a) " + jogador1.getNome();
        } else {
            return "Erro de outro caso";
        }
    }

    private String calcularResultadoPlayerVsPlayer() {
        // iniciar socker etc
        return "";
    }

    private void IniciarJogadaMaquina() {
        this.Jogadores[1] = new Jogador("Maquina");
        this.Jogadores[1].Jogada = GerarEstadoAleatorio();
    }

    private Jogadas GerarEstadoAleatorio() {
        int valor = new Random().nextInt(3) + 1;
        return Jogadas.fromInteger(valor);
    }

    public enum Jogadas {
        Pedra, Papel, Tesoura;

        public static Jogadas fromInteger(int jogada) {
            switch (jogada) {
                case 1:
                    return Pedra;
                case 2:
                    return Papel;
                case 3:
                    return Tesoura;
            }
            return null;
        }
    }

    public enum OpcaoDeJogo {
        Maquina, Jogador;

        public static OpcaoDeJogo fromInteger(int opcao) {
            switch (opcao) {
                case 1:
                    return Maquina;
                case 2:
                    return Jogador;
            }
            return null;
        }
    }
}
