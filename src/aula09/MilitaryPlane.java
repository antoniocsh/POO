package aula09;

public class MilitaryPlane extends Plane {
    private int numAmmo;

    public MilitaryPlane(String id, String name, String fabricante, String modelo, int anoProd, int passageiros, int maxVel, int numAmmo) {
        super(id, name, fabricante, modelo, anoProd, passageiros, maxVel);
        this.numAmmo = numAmmo;
    }

    public int getNumAmmo() {
        return numAmmo;
    }

    public void setNumAmmo(int numAmmo) {
        this.numAmmo = numAmmo;
    }

    public String getPlaneType() {
        return "Militar";
    }

    @Override
    public String toString() {
        String s = super.toString() + "; Munições: " + numAmmo;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MilitaryPlane other = (MilitaryPlane) obj;
        if ((this.getName() == null) ? (other.getName() != null) : !this.getName().equals(other.getName())) {
            return false;
        }
        if ((this.getFabricante() == null) ? (other.getFabricante() != null) : !this.getFabricante().equals(other.getFabricante())) {
            return false;
        }
        if ((this.getModelo() == null) ? (other.getModelo() != null) : !this.getModelo().equals(other.getModelo())) {
            return false;
        }
        if (this.getAnoProd() != other.getAnoProd()) {
            return false;
        }
        if (this.getPassageiros() != other.getPassageiros()) {
            return false;
        }
        if (this.getMaxVel() != other.getMaxVel()) {
            return false;
        }
        if (this.numAmmo != other.numAmmo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.getName() != null ? this.getName().hashCode() : 0);
        hash = 97 * hash + (this.getFabricante() != null ? this.getFabricante().hashCode() : 0);
        hash = 97 * hash + (this.getModelo() != null ? this.getModelo().hashCode() : 0);
        hash = 97 * hash + this.getAnoProd();
        hash = 97 * hash + this.getPassageiros();
        hash = 97 * hash + this.getMaxVel();
        hash = 97 * hash + this.numAmmo;
        return hash;
    }
  
}
