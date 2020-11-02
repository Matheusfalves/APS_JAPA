package game;

public class Player {
    private String Nome;
    private String Estado;
    
    
    Player(String N){
        this.Nome = N;
    }
    public void setNome(String N){
        this.Nome = N;
    }
    public String getNome(){
        return Nome;
    }
    public void setEstado(String E){
        switch(E){
            case "Pedra":
                this.Estado = E;
            break;
            case "Papel":
                this.Estado = E;
            break;
            case "Tesoura":
                this.Estado = E;
            break;
            default:
                System.out.println("O valor desejado não é valido");
        }
    }
    public String getEstado(){
        return Estado;
    }
    
}
