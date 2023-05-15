package a00teste_na_aula;

import java.util.Scanner;
import utils.*;

public class TournamentManagerMain {
    public static void main(String[] args) {
        TournamentManager chessTournament = new TournamentManager();
        TournamentManager checkersTournament = new TournamentManager();
        // boolean  tournamentStarted = false;
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        int escolha;
        String nome, clube;
        

        while (!choice.equals("7")) {
            System.out.println("TournamentManager Menu:");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. Start game");           
            System.out.println("4. New round");
            System.out.println("5. Search player");
            System.out.println("6. Print tournament(s) info");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Player creation menu:");
                    System.out.println("1. Create ChessPlayer");
                    System.out.println("2. Create CheckersPlayer");
                    System.out.println("3. Go back");

                    escolha = UserInput.intInput("Enter choice: ");

                    switch(escolha){
                        case 1:
                            nome = UserInput.stringInput("Nome? ");
                            clube = UserInput.stringInput("Clube? ");
                            ChessPlayer xp = new ChessPlayer(nome, clube);
                            chessTournament.addPlayer(xp);
                            break;
                        case 2:
                            nome = UserInput.stringInput("Nome? ");
                            clube = UserInput.stringInput("Clube? ");
                            CheckersPlayer cp = new CheckersPlayer(nome, clube);
                            chessTournament.addPlayer(cp);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid option!");
                            break;
                    }
                    break;

                case "2":
                    // remover um jogador
                    System.out.println("Player remover menu:");
                    // String nomeid = UserInput.stringInput("Nome ou ID do jogador:");
                    //Player jogador = TournamentManager.searchForPlayer(nomeid); 
                    break;
                    
                    
                case "3":
                    // início do(s) torneio(s)
                case "4":
                    // nova ronda (se torneio(s) terminado(s), nao 
                    // deve fazer nada)                               
                case "5":
                    // procurar um jogador e imprimir as suas informações
                case "6":
                    // imprimir lista dos jogadores e respetiva pontuação

                    System.out.println(checkersTournament);
                    System.out.println(chessTournament);

                case "7":
                    System.out.println("Exiting program.");
                    break;
                default:
                    // imprimir mensagem de erro
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }

    public static int tentarID(String tentar){
        int id;
        try {
            id = Integer.parseInt(tentar);
        } catch (NumberFormatException e) {
            id = 0;
        }
        return id;
    }

    // public static int setEloChess(){
    //     Random randnum = new Random();
    //     int elo = randnum.nextInt(101);
    //     return elo;
    // }

    // public static int setEloCheckers(){
    //     Random randnum = new Random();
    //     int elo = randnum.nextInt(51);
    //     return elo;
    // }


}
