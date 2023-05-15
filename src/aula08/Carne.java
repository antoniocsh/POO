package aula08;


public class Carne extends Alimento {

    private CarneTipo tipo;

    public Carne(CarneTipo tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public CarneTipo getTipo() {
        return tipo;
    }

    public void setTipo(CarneTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Carne %s, %s", tipo, super.toString());
    }

}
