package game;

import game.Jogo.Jogadas;

public class Jogador {
    private String Nome;
    public Jogadas Jogada;

    Jogador(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }
}
