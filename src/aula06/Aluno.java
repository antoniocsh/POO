package aula06;

import utils.*;

public class Aluno extends Pessoa {
    private DateYMD dataInsc;
    private int numMec;
    private static int nextNumMec = 100;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        super(nome, cc, dataNasc);
        this.dataInsc = dataInsc;
        this.numMec = nextNumMec++;
    }

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
        this.dataInsc = DateYMD.hoje();
        this.numMec = nextNumMec++;
    }

    public DateYMD getDataInsc(){
        return dataInsc;

    }

    public int getNumMec(){
        return numMec;
    }

    @Override
	public String toString() {
        String s = String.format("%s; NMec: %d; Data de Inscrição: %s", this.getNome(), this.getNumMec(), this.getDataInsc());
		return s;
	}

    
}
