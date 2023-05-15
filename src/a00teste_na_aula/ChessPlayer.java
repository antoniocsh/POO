package a00teste_na_aula;

import java.util.Random;

public class ChessPlayer extends Player {
    private int elo;

    public ChessPlayer(String nome, String clube){
        super(nome, clube);
        Random randnum = new Random();
        int elo = randnum.nextInt(101);
        this.elo = elo;
    }

    public int getElo(){
        return elo;
    }

    public void setElo(int elo){
        this.elo = elo;
    }

    @Override
    public String toString() {
        return String.format("ChessPlayer: Nome: %s, ID: %d,Clube: %s, ELO: %d, Pontos: %.1f", this.getNome(), this.getID(), this.getClube(), this.getElo(), this.getPontos());
    }
    
}
