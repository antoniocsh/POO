package aula08;

public class Legume extends Alimento implements Vegetariano {
    private String nome;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Legume %s, %s", nome, super.toString());
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }
    
}
