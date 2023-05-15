package a00teste_na_aula;

import java.util.ArrayList;
import java.util.List;

public class TournamentManager {
    public List<Player> players;

    public TournamentManager(){
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public Player searchForPlayer(int id){
        for (Player player : players){
            if (player.getID() == id){
                return player;
            }
        }
        return null;
    }

    public Player searchForPlayer(String nome){
        for (Player player : players){
            if (player.getNome().equals(nome)){
                return player;
            }
        }
        return null;
    }


    public String toString(){
        String s = "Players: \n";
        for (Player player : players){
            s += player.toString() + "\n";    
        }
        return s;
    }


    





    


}
