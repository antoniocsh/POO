package aula08;

public class Taxi extends AutoLigeiro {
    private int numLicenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int bagageira, String numQuadro, int numLicenca) {
        super(matricula, marca, modelo, potencia, bagageira, numQuadro);
        this.numLicenca = numLicenca;
    }

    public int getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(int numLicenca) {
        this.numLicenca = numLicenca;
    }


    @Override
    public String toString() {
        return String.format("Taxi: Matricula: %s, Marca: %s, Modelo: %s, Potencia: %d, Bagageira: %d, Número do Quadro: %s, NumLicenca: %d, Km Percorridos: %d, Ultimo Trajeto: %d", this.getMatricula() != null ? this.getMatricula() : "Inválida", this.getMarca(), this.getModelo(), this.getPotencia(), this.getBagageira(), this.getNumQuadro(), this.getNumLicenca(), this.distanciaTotal(), this.ultimoTrajeto());
    }
    
}
