package aula04;

class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
    
}


class CashRegister {
    private String[][] lista = new String[1][4];
    private double totalvalue;
    public CashRegister(){
        lista[0][0] = "Product";
        lista[0][1] = "Price";
        lista[0][2] = "Quantity";
        lista[0][3] = "Total";
    }
    public String[][] addProduct(Product produto){
        int i;
        int n = lista.length;
        String[][] novalista = new String[n+1][4];
        for (i = 0; i < n; i++){
            novalista[i][0] = lista[i][0];
            novalista[i][1] = lista[i][1];
            novalista[i][2] = lista[i][2];
            novalista[i][3] = lista[i][3];
        }
        novalista[n][0] = produto.getName();
        novalista[n][1] = String.valueOf(produto.getPrice());
        novalista[n][2] = String.valueOf(produto.getQuantity());
        novalista[n][3] = String.valueOf((produto.getTotalValue()));
        lista = novalista;
        return lista;
    }
    public double getTotalValue(){
        int i;
        int n = lista.length;
        for (i = 1; i < n; i++){
            totalvalue += Double.parseDouble(lista[i][3]);
        }
        return totalvalue;
    }
    public String toString(){
        int i;
        int n = lista.length;
        String printlista = "";
        printlista += String.format("%-20s %5s %12s %12s\n", lista[0][0], lista[0][1], lista[0][2], lista[0][3]);
        for (i = 1; i < n; i++){
            printlista += String.format("%-20s %5.2f %12s %12.2f\n", lista[i][0], Double.parseDouble(lista[i][1]), lista[i][2], Double.parseDouble(lista[i][3]));

        }
        printlista += String.format("\nTotal Value: %.2f", getTotalValue());
        return printlista;
    }

}

public class Ex2_CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
      
        System.out.println(cr);

    }
}