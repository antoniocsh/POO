package aula08;

import java.util.ArrayList;

public class Prato {
    private String nome; 
    private ArrayList<Alimento> composicao = new ArrayList<Alimento>();
    private DiaSemana dia;

    public Prato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Alimento> getComposicao() {
        return composicao;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComposicao(ArrayList<Alimento> composicao) {
        this.composicao = composicao;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public boolean addIngrediente(Alimento a){
        composicao.add(a);
        return true;
    }

    public double getCalorias(){
        double calorias = 0;
        for (Alimento alimento : composicao) {
            calorias += alimento.getCalorias();
        }
        return calorias;
    }

    public double getProteinas(){
        double proteinas = 0;
        for (Alimento alimento : composicao) {
            proteinas += alimento.getProteinas();
        }
        return proteinas;
    }

    public double getPeso(){
        double peso = 0;
        for (Alimento alimento : composicao) {
            peso += alimento.getPeso();
        }
        return peso;
    }

    @Override
    public String toString() {
        return String.format("Prato %s, calorias %.1f, proteinas %.1f, peso %.1f", nome, getCalorias(), getProteinas(), getPeso());    
    }
    
}
