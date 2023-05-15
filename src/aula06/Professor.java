package aula06;

import utils.*;

public class Professor extends Pessoa{
    private String categoria;
    private String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento) {
        super(nome, cc, dataNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString(){
        String s = String.format("%s; Categoria: %s; Departamento: %s", super.toString(), this.getCategoria(), this.getDepartamento());
        return s;

    }
}
