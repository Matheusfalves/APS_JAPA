package game;

public class Game {
    private Player Jogadores[]; 
    Robo Maquina = new Robo();
    
    
    
//Construtores    
    public void jogarVsMaquina(Player p1){
        this.Jogadores[0] = p1;   
        calcularResultadoPlayerVsMaquina();
    }
    public void jogarPlayerVsPlayer(Player p1,Player p2){
        this.Jogadores[0] = p1;
        this.Jogadores[1] = p2;
        calcularResultadoPlayerVsPlayer();
    }
    
    
//Função que gera o resultado do jogador contra o jogador    
    private String calcularResultadoPlayerVsPlayer(){
        if(Jogadores[0].getEstado().equals(Jogadores[1].getEstado())){
            return "Essa rodada empatou";
        }
        else if ("Tesoura".equals(Jogadores[0].getEstado()) && "Papel".equals(Jogadores[1].getEstado())){
            return "O jogador "+Jogadores[0].getNome()+ "ganhou cortando o papel do "+Jogadores[1].getNome();
        }
        else if ("Pedra".equals(Jogadores[0].getEstado()) && "Tesoura".equals(Jogadores[1].getEstado())){
            return "O jogador "+Jogadores[0].getNome()+ "ganhou quebrando a Tesoura do "+Jogadores[1].getNome();
        }
        else if ("Papel".equals(Jogadores[0].getEstado()) && "Pedra".equals(Jogadores[1].getEstado())){
            return "O jogador "+Jogadores[0].getNome()+ "ganhou Embrulhando a pedra do "+Jogadores[1].getNome();
        }
        else if ("Tesoura".equals(Jogadores[1].getEstado()) && "Papel".equals(Jogadores[0].getEstado())){
            return "O jogador "+Jogadores[1].getNome()+ "ganhou cortando o papel do "+Jogadores[0].getNome();
        }
        else if ("Pedra".equals(Jogadores[1].getEstado()) && "Tesoura".equals(Jogadores[0].getEstado())){
            return "O jogador "+Jogadores[1].getNome()+ "ganhou quebrando a Tesoura do "+Jogadores[0].getNome();
        }
        else if ("Papel".equals(Jogadores[1].getEstado()) && "Pedra".equals(Jogadores[0].getEstado())){
            return "O jogador "+Jogadores[1].getNome()+ "ganhou Embrulhando a pedra do "+Jogadores[0].getNome();
        }
        else {
            return "Erro de outro caso";
        }           
    }
    
    //Função que gera o resultado do jogador contra a maquina
    private String calcularResultadoPlayerVsMaquina(){
        if(Jogadores[0].getEstado().equals(Maquina.getEstado())){
            return "Essa rodada empatou";
        }
        else if ("Tesoura".equals(Jogadores[0].getEstado()) && "Papel".equals(Maquina.getEstado())){
            return "O jogador "+Jogadores[0].getNome()+ "ganhou cortando o papel do "+Maquina.getNome();
        }
        else if ("Pedra".equals(Jogadores[0].getEstado()) && "Tesoura".equals(Maquina.getEstado())){
            return "O jogador "+Jogadores[0].getNome()+ "ganhou quebrando a Tesoura do "+Maquina.getNome();
        }
        else if ("Papel".equals(Jogadores[0].getEstado()) && "Pedra".equals(Maquina.getEstado())){
            return "O jogador "+Jogadores[0].getNome()+ "ganhou Embrulhando a pedra do "+Maquina.getNome();
        }
        else if ("Tesoura".equals(Maquina.getEstado()) && "Papel".equals(Jogadores[0].getEstado())){
            return "O jogador "+Maquina.getNome()+ "ganhou cortando o papel do "+Jogadores[0].getNome();
        }
        else if ("Pedra".equals(Maquina.getEstado()) && "Tesoura".equals(Jogadores[0].getEstado())){
            return "O jogador "+Maquina.getNome()+ "ganhou quebrando a Tesoura do "+Jogadores[0].getNome();
        }
        else if ("Papel".equals(Maquina.getEstado()) && "Pedra".equals(Jogadores[0].getEstado())){
            return "O jogador "+Maquina.getNome()+ "ganhou Embrulhando a pedra do "+Jogadores[0].getNome();
        }
        else {
            return "Erro de outro caso";
        }           
    }
}
    
    

