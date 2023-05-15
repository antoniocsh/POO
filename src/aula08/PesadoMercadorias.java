package aula08;

import utils.*;

public class PesadoMercadorias extends Veiculo {
    private String numQuadro;
    private double peso;
    private double cargaMax;
    private static int numQuadrocounter = 0;

    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, String numQuadro, double peso, double cargaMax) {
        super(matricula, marca, modelo, potencia);
        if (Valids.validNumQuadro(numQuadro)){
        this.numQuadro = numQuadro;
        }
        else{
            this.numQuadro = String.format("%017d", numQuadrocounter);
            numQuadrocounter++;
        }
        this.peso = peso;
        this.cargaMax = cargaMax;
    }

    public String getnumQuadro() {
        return numQuadro;
    }

    public double getPeso() {
        return peso;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setnumQuadro(String numQuadro) {
        if (Valids.validNumQuadro(numQuadro)){
        this.numQuadro = numQuadro;
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String toString() {
        return String.format("PesadoMercadorias: Matricula: %s, Marca: %s, Modelo: %s, Potencia: %d, Número do Quadro: %s, Peso: %f, CargaMax: %.2f, Km Percorridos: %d, Ultimo Trajeto: %d", this.getMatricula() != null ? this.getMatricula() : "Inválida", this.getMarca(), this.getModelo(), this.getPotencia(), this.getnumQuadro(), this.getPeso(), this.getCargaMax(), this.distanciaTotal(), this.ultimoTrajeto());
    }
}
