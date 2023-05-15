package aula08;

import utils.*;

public class PesadoPassageiros extends Veiculo {
    private String numQuadro;
    private double peso;
    private int numPassageiros;
    private static int numQuadrocounter = 0;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia, String numQuadro, double peso, int numPassageiros) {
        super(matricula, marca, modelo, potencia);
        if (Valids.validNumQuadro(numQuadro)){
            this.numQuadro = numQuadro;
            }
        else{
            this.numQuadro = String.format("%017d", numQuadrocounter);
            numQuadrocounter++;
        }
        this.peso = peso;
        this.numPassageiros = numPassageiros;
    }

    public String getNumQuadro() {
        return numQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public int getnumPassageiros() {
        return numPassageiros;
    }

    public void setNumQuadro(String numQuadro) {
        if (Valids.validNumQuadro(numQuadro)){
            this.numQuadro = numQuadro;
            }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setnumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    @Override
    public String toString() {
        return String.format("PesadoMercadorias: Matricula: %s, Marca: %s, Modelo: %s, Potencia: %d, Número do Quadro: %s, Peso: %f, Número de Passageiros: %d, Km Percorridos: %d, Ultimo Trajeto: %d", this.getMatricula() != null ? this.getMatricula() : "Inválida", this.getMarca(), this.getModelo(), this.getPotencia(), this.getNumQuadro(), this.getPeso(), this.getnumPassageiros(), this.distanciaTotal(), this.ultimoTrajeto());
    }
}
