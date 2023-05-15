package aula09;

public class CommercialPlane extends Plane {
    private int numTripulantes;

    public CommercialPlane(String id, String name, String fabricante, String modelo, int anoProd, int passageiros, int maxVel, int numTripulantes) {
        super(id, name, fabricante, modelo, anoProd, passageiros, maxVel);
        this.numTripulantes = numTripulantes;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public String getPlaneType() {
        return "Commercial";
    }

    @Override
    public String toString() {
        String s = super.toString() + "; Tripulantes: " + numTripulantes;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        CommercialPlane p = (CommercialPlane) obj;
        return (super.equals(p) && numTripulantes == p.numTripulantes);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + numTripulantes;
        return hash;
    }
    
}
