package aula07;

class Retangulo extends Forma{
    private double base;
    private double altura;

    public String cor(){
        return getCor();
    }

    public Retangulo(double base, double altura, String cor){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }
    
    public double getAltura(){
        return altura;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2 * (base + altura);
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString(){
        return String.format("Retângulo: Base -> %.2f, Altura -> %.2f, Área -> %.2f, Perímetro -> %.2f", base, altura, area(), perimetro());
    }

    @Override
    public boolean equals(Object retangulo){
        if (retangulo instanceof Retangulo){
            Retangulo retangulo1 = (Retangulo) retangulo;
            return area() == retangulo1.area() && perimetro() == retangulo1.perimetro() && getCor().equals(retangulo1.getCor());
        }
        else{
            return false;
        }
    }




    
}
