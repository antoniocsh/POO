package aula04;

import java.util.Arrays;

class Triangulo{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double[] lados = new double[3];

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        lados[0] = ladoA;
        lados[1] = ladoB;
        lados[2] = ladoC;
        Arrays.sort(lados);
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double[] getLados() {
        return lados;
    }

    public double getArea(){
        double p = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    public double getPerimetro(){
        return ladoA + ladoB + ladoC;
    }

    public String toString(){
        return String.format("Triângulo: Lado A -> %.2f, Lado B -> %.2f, Lado C -> %.2f, Área -> %.2f, Perímetro -> %.2f", ladoA, ladoB, ladoC, getArea(), getPerimetro());
    }

    public boolean equals(Triangulo triangulo){
        if (triangulo instanceof Triangulo){
            Triangulo triangulo1 = (Triangulo) triangulo;
            return Arrays.equals(lados, triangulo1.getLados());
        }
        else{
            return false;
        }
    }






}