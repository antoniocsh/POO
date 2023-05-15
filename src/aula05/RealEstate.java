package aula05;

import java.util.ArrayList;
import java.util.List;

class RealEstate {
    public List<Property> properties;
    private int num;

    public RealEstate() {
        this.properties = new ArrayList<Property>();
        this.num = 1000;
    }


    public void newProperty(String localidade, int quartos, int preco) {
        Property p = new Property(num, localidade, quartos, preco);
        properties.add(p);
        num++;
    }

    private Property getPropertyByNum(int num) {
        for (Property p : properties) {
            if (p.getNum() == num) {
                return p;
            }
        }
        return null;
    }

    public void setAuction(int num, DateYMD dataInicial, int dias) {
        Property p = getPropertyByNum(num);
            if (p != null) { {
                if (p.getDisponibilidade() == true) {
                    p.setDataInicial(dataInicial);
                    p.setDataFinal(dataInicial, dias);
                } else {
                    System.out.printf("Imóvel %s não está disponível.\n", num);
                }
            }
        } else {
            System.out.printf("Imóvel %s não existe.\n", num);
        }
    }

    public void sell(int num) {
        Property p = getPropertyByNum(num);
            if (p != null) {
                if (p.getDisponibilidade()) {
                    p.setDisponibilidade(false);
                    p.setDataInicial(null);
                    p.dataFinal = null;
                    System.out.printf("Imóvel %s vendido.\n", num);

                    
                } else {
                    System.out.printf("Imóvel %s não disponível.\n", num);
                    
                }
            }
        }
    

    public String toString() {
        String s = "Propriedades:\n";
        for (Property p : properties) {
            s += p.toString() + "\n";
        
        }
    
        return s;
}

}
