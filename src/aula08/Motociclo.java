package aula08;

public class Motociclo extends Veiculo {
    private MotoTipo tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, MotoTipo tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }
    
    public MotoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MotoTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("Motociclo: Matricula: %s, Marca: %s, Modelo: %s, Potencia: %d, Tipo: %s, Km Percorridos: %d, Ultimo Trajeto: %d", this.getMatricula() != null ? this.getMatricula() : "Inválida", this.getMarca(), this.getModelo(), this.getPotencia(), this.getTipo(), this.distanciaTotal(), this.ultimoTrajeto());
    }


}
