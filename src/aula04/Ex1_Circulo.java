package aula04;

class Circulo {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    public double getArea(){
        return Math.PI * this.raio * this.raio;
    }
    public double getPerimetro(){
        return 2 * Math.PI * this.raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public String toString(){
        return String.format("Círculo: Raio -> %.2f, Área -> %.2f, Perímetro -> %.2f", this.raio, getArea(), getPerimetro());
    }
    public boolean equals(Circulo circulo){
        if (circulo instanceof Circulo){
            Circulo circulo1 = (Circulo) circulo;
            return raio == circulo1.getRaio();
        }
        else{
            return false;
        }
    }
}



