package aula08;

public class PratoDieta extends Prato {
    double maxCal;

    public PratoDieta(String nome, double maxCal) {
        super(nome);
        this.maxCal = maxCal;
    }

    public double getMaxCal() {
        return maxCal;
    }

    public void setMaxCal(double maxCal) {
        this.maxCal = maxCal;
    }

    @Override
    public boolean addIngrediente(Alimento alimento) {
        if (alimento.getCalorias() + getCalorias() <= maxCal) {
            super.addIngrediente(alimento);
            return true;
        } else {
            System.out.println("Alimento não adicionado");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("PratoDieta %s, calorias %.1f, proteinas %.1f, peso %.1f", getNome(), getCalorias(), getProteinas(), getPeso());
    }
    
}
