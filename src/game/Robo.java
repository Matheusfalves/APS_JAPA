package game;

import java.util.Random;

public class Robo {
    private final String Nome = "Maquina";
    private String Estado;
    

    public Robo() {
        GerarEstado();
    }

    public String getEstado() {
        return Estado;
    }
    public String getNome(){
        return Nome;
    }
    
//Gera o estado do que o robo vai jogar
    private void GerarEstado(){
    Random GerarAleatorio = new Random();
    int valor = GerarAleatorio.nextInt(3); //Precisa testar se ele não ta colocando o 0 nos valores aleatorios tbm
        switch (valor) {
            case 1:
                Estado = "Pedra";
                break;
            case 2:
                Estado = "Papel";
                break;
            case 3:
                Estado = "Tesoura";
                break;
            default:
                break;
        }
    }
    
}
