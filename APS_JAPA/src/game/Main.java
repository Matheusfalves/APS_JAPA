package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome do player");
        Player P1 = new Player(entrada.nextLine());
        
        
    }
}
