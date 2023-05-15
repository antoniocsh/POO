package aula04;

class Retangulo{
    private double base;
    private double altura;
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public double getArea(){
        return base * altura;
    }
    public double getPerimetro(){
        return 2 * (base + altura);
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public String toString(){
        return String.format("Retângulo: Base -> %.2f, Altura -> %.2f, Área -> %.2f, Perímetro -> %.2f", base, altura, getArea(), getPerimetro());
    }
    public boolean equals(Retangulo retangulo){
        if (retangulo instanceof Retangulo){
            Retangulo retangulo1 = (Retangulo) retangulo;
            return getArea() == retangulo1.getArea() && getPerimetro() == retangulo1.getPerimetro();
        }
        else{
            return false;
        }
    }




    
}
