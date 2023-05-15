package aula06;

import utils.*;

public class Bolseiro extends Aluno {
    private int bolsa;
    private Professor orientador;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc, Professor orientador, int bolsa) {
        super(nome, cc, dataNasc, dataInsc);
        this.orientador = orientador;
        this.bolsa = bolsa;
    }

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int bolsa) {
        super(nome, cc, dataNasc);
        this.orientador = orientador;
        this.bolsa = bolsa;
    }

    public int getBolsa() {
        return bolsa;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        String s = String.format("%s; Bolsa: %d; Orientador: %s", super.toString(), this.getBolsa(), this.getOrientador().getNome());
        return s;
    }
    
}
