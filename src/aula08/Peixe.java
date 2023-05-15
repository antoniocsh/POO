package aula08;

public class Peixe extends Alimento{

    private PeixeTipo tipo;

    public Peixe(PeixeTipo tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public PeixeTipo getTipo() {
        return tipo;
    }

    public void setTipo(PeixeTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Peixe %s, %s", tipo, super.toString());
    }

    
}
