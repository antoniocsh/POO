package aula08;
 
import utils.*;

public class Veiculo implements KmPercorridosInterface{
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int kmPercorridos;
    private int ultimoTrajeto;

    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        if (Valids.validMatricula(matricula)){
        this.matricula = matricula;
    }
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.kmPercorridos = 0;
        this.ultimoTrajeto = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    } 

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void trajeto(int quilometros) {
        kmPercorridos += quilometros;
        ultimoTrajeto = quilometros;
    }

    @Override
    public int ultimoTrajeto() {
        return ultimoTrajeto;
    }

    @Override
    public int distanciaTotal() {
        return kmPercorridos;
    }

    @Override
    public String toString() {
        String s = String.format("Matricula: %s; Marca: %s; Modelo: %s; Potencia: %dcv; Km Percorridos: %d", matricula != null ? matricula : "Inválida" , marca, modelo, potencia, kmPercorridos);
        return s;
    }


    
}
