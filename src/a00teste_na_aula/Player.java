package a00teste_na_aula;

public class Player {
    private int id;
    private String nome;
    private String clube;
    private static int idCounter = 1;
    private double pontos;

    public Player(String nome, String clube){
        this.nome = nome;
        this.clube = clube;
        this.id = idCounter++;
        this.pontos = 0;
    }

    public String getNome(){
        return nome;
    }

    public String getClube(){
        return clube;
    }

    public int getID(){
        return id;
    }

    public double getPontos(){
        return pontos;
    }

    public void setPontos(double pontos){
        this.pontos = pontos;
    }

    public void addPontos(double addpontos){
        this.pontos += addpontos;
    }

    public void setClube(String clube){
        this.clube = clube;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public String toString(){
        return String.format("Nome: %s; ID: %d; Clube: %s; ", this.getNome(), this.getID(), this.getClube());
    }

    




    
    
}
