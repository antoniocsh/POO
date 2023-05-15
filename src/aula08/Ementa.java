package aula08;

import java.util.ArrayList;

public class Ementa {
    private String nome;
    private String local;
    ArrayList<Prato> pratos = new ArrayList<Prato>();

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Prato p) {
        pratos.add(p);
    }

    public void addPrato(Prato p, DiaSemana d) {
        pratos.add(p);
        p.setDia(d);
    }

    @Override
    public String toString() {
        String s = String.format("Ementa %s, %s\nPratos:", nome, local);
        for (Prato prato : pratos) {
            s += String.format("%s\n", prato);
        }
        return s;
    }
}
