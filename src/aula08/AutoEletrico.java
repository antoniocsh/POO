package aula08;

public class AutoEletrico extends AutoLigeiro implements VeiculoEletrico{
    private int autonomia;

    public AutoEletrico(String matricula, String marca, String modelo, int potencia, int bagageira, String numQuadro) {
        super(matricula, marca, modelo, potencia, bagageira, numQuadro);
        this.autonomia = 100;
    }

    @Override
    public int autonomia() {
        return this.autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        if (percentagem > 0 && percentagem <= 100){
            this.autonomia += percentagem;
        }
        if (this.autonomia > 100){
            this.autonomia = 100;
        }
    }

    @Override
    public void trajeto(int quilometros) {
        int oi2 = 0;
        int oi = (int) (quilometros * 0.1);
        this.autonomia -= oi;
        if (this.autonomia < 0){
            oi2 = (int) (Math.abs((double) this.autonomia / 0.1));
            this.autonomia = 0;
        }
        quilometros = quilometros - oi2;
        super.trajeto(quilometros);
    }



    @Override
    public String toString() {
        return String.format("AutoEletrico: Matricula: %s, Marca: %s, Modelo: %s, Potencia: %d, Bagageira: %d, Número do Quadro: %s, Km Percorridos: %d, Ultimo Trajeto: %d", this.getMatricula() != null ? this.getMatricula() : "Inválida", this.getMarca(), this.getModelo(), this.getPotencia(), this.getBagageira(), this.getNumQuadro(), this.autonomia(), this.distanciaTotal(), this.ultimoTrajeto());
    }



    
}
