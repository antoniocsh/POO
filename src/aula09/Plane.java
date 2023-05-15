package aula09;

public abstract class Plane {
    private String id;
    private String name;
    private String fabricante;
    private String modelo;
    private int anoProd;
    private int passageiros;
    private int maxVel;
    
    public Plane(String id, String name, String fabricante, String modelo, int anoProd, int passageiros, int maxVel) {
        if (anoProd < 0 || anoProd > 2023) {
            System.out.println("Ano de produção inválido");
        } else {
            this.id = id;
            this.name = name;
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.anoProd = anoProd;
            this.passageiros = passageiros;
            this.maxVel = maxVel;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoProd() {
        return anoProd;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public int getMaxVel() {
        return maxVel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoProd(int anoProd) {
        this.anoProd = anoProd;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void setMaxVel(int maxVel) {
        this.maxVel = maxVel;
    }

    public abstract String getPlaneType();

    @Override
    public String toString() {
        String s = String.format("%s %s; Fabricante: %s; Modelo: %s; Ano de Produção: %d; Passageiros: %d; Velocidade Máxima: %d", name, id, fabricante, modelo, anoProd, passageiros, maxVel);
        return s;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + anoProd;
        result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
        result = prime * result + maxVel;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + passageiros;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Plane other = (Plane) obj;
        if (anoProd != other.anoProd)
            return false;
        if (fabricante == null) {
            if (other.fabricante != null)
                return false;
        } else if (!fabricante.equals(other.fabricante))
            return false;
        if (maxVel != other.maxVel)
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (passageiros != other.passageiros)
            return false;
        return true;
    }
}
