package aula08;

public class Cereal extends Alimento implements Vegetariano {
    private String nome;

    public Cereal(String nome, double proteinas, double calorias, double peso) {
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
        return String.format("Cereal %s, %s", nome, super.toString());
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }
    
}
