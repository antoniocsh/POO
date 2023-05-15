package aula03;

import java.util.Random;
import utils.*;
import java.util.Scanner;

public class Ex3_AltoBaixo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            int guess;
            int contagem = 1;
            Random randnum = new Random();
            int jogo = randnum.nextInt(101);
            guess = UserInput.intIntervalo("Adivinhe: ", 0, 100);
            while (guess != jogo){
                if (guess > jogo){guess = UserInput.intIntervalo("Demasiado grande, tenta outra vez: ", 0, 100);contagem++;}
                else if (guess < jogo){guess = UserInput.intIntervalo("Demasiado pequeno, tenta outra vez: ", 0, 100);contagem++;}
            }
            System.out.print("Correto! O número secreto era "+jogo+ ". Tentativas: "+contagem+".\nSe quiseres jogar novamente digita (S)im! ");
            String resposta = sc.next();
            resposta = resposta.toUpperCase();
            if (resposta.equals("S") || resposta.equals("SIM")){
                continuar = true;}
            else {
                continuar = false;}            
        }
        sc.close();
}
    
}
