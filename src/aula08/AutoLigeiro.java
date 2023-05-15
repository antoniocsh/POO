package aula08;

import utils.*;

public class AutoLigeiro extends Veiculo {
    private int bagageira;
    private String numQuadro;
    private static int numQuadrocounter = 0;

    public AutoLigeiro(String matricula, String marca, String modelo, int potencia, int bagageira, String numQuadro) {
        super(matricula, marca, modelo, potencia);
        this.bagageira = bagageira;
        if (Valids.validNumQuadro(numQuadro)){
            this.numQuadro = numQuadro;
            }
        else{
            this.numQuadro = String.format("%017d", numQuadrocounter);
            numQuadrocounter++;
        }
    }

    public int getBagageira() {
        return bagageira;
    }

    public String getNumQuadro() {
        return numQuadro;
    }

    public void setBagageira(int bagageira) {
        this.bagageira = bagageira;
    }

    public void setNumQuadro(String numQuadro) {
        if (Valids.validNumQuadro(numQuadro)){
            this.numQuadro = numQuadro;
            }
    }

    @Override
    public String toString() {
        return String.format("AutoLigeiro: Matricula: %s, Marca: %s, Modelo: %s, Potencia: %d, Bagageira: %d, Número do Quadro: %s, Km Percorridos: %d, Ultimo Trajeto: %d", this.getMatricula() != null ? this.getMatricula() : "Inválida", this.getMarca(), this.getModelo(), this.getPotencia(), this.getBagageira(), this.getNumQuadro(), this.distanciaTotal(), this.ultimoTrajeto());
    }

    
}
