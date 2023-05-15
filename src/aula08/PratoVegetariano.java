package aula08;

public class PratoVegetariano extends Prato {
    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addIngrediente(Alimento alimento) {
        if (alimento instanceof Vegetariano) {
            super.addIngrediente(alimento);
            return true;
        } else {
            System.out.println("Alimento não é vegetariano");
            return false;
        }
    }
    
}
