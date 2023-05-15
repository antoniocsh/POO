package aula07;

class Circulo extends Forma  {
    private double raio;
    
    public String cor(){
        return getCor();
    }

    public Circulo(double raio, String cor){
        super(cor);
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    public double area(){
        return Math.PI * this.raio * this.raio;
    }
    public double perimetro(){
        return 2 * Math.PI * this.raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public String toString(){
        return String.format("Círculo: Raio -> %.2f, Área -> %.2f, Perímetro -> %.2f", this.raio, area(), perimetro());
    }

    @Override
    public boolean equals(Object circulo){
        if (circulo instanceof Circulo){
            Circulo circulo1 = (Circulo) circulo;
            return raio == circulo1.getRaio() && getCor().equals(circulo1.getCor());
        }
        else{
            return false;
        }
    }
}



