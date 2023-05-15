package aula05;

class Property {
    private int quartos; 
    private String localidade;
    private int preco;
    int num;
    boolean disponibilidade;
    DateYMD dataInicial;
    DateYMD dataFinal;



    public Property(int num, String localidade, int quartos, int preco) {
        this.num = num;
        this.quartos = quartos;
        this.localidade = localidade;
        this.preco = preco;
        this.disponibilidade = true;
        this.dataFinal = null;
        this.dataInicial = null;
    }
        
    public int getNum() {
        return num;
    }

    public int getQuartos() {
        return quartos;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getPreco() {
        return preco;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public DateYMD getDataInicial() {
        return dataInicial;
    }

    public DateYMD getDataFinal() {
        return dataFinal;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setDataInicial(DateYMD dataInicial) {
        this.dataInicial = dataInicial;

    }

    public void setDataFinal(DateYMD data, int dias) {
        DateYMD datainic = new DateYMD(data.getDay(), data.getMonth(), data.getYear());
        for (int i = 0; i < dias; i++) {
            datainic.increment();
        }
        this.dataFinal = datainic;
    }

    

    public String toString() {
        String s = "";
        if (dataInicial == null || dataFinal == null){
            s = String.format("Imóvel: %d, Quartos: %d, Localidade: %s, preço: %d, disponível: %s", num, quartos, localidade, preco, disponibilidade ? "sim" : "não");
            
        }
        else {
        s = String.format("Imóvel: %d, Quartos: %d, Localidade: %s, preço: %d, disponível: %s, leilão %s : %s", num, quartos, localidade, preco, disponibilidade ? "sim" : "não", dataInicial.toString(), dataFinal.toString());
        };	
        return s;
        }





}
