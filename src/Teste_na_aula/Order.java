package Teste_na_aula;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order implements Comparable<Order> {
    private static int count = 1;
    private int id;
    private ArrayList<Item> items;
    private double price;
    private String storeId;
    private String clientId;
    private LocalDate orderDateTime;
    private boolean pedidoExpresso;

    public Order(String clientId, String storeId, ArrayList<Item> items, String date, Boolean pedidoExpresso){
        this.id = count++;
        this.items = items;
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = LocalDate.parse(date);
        this.pedidoExpresso = pedidoExpresso;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getPrice() {
        StandardOrderCostCalculator socc = new StandardOrderCostCalculator();
        return socc.calculateOrderCost(this);
    }

    public String getStoreId() {
        return storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public LocalDate getOrderDateTime() {
        return orderDateTime;
    }

    public boolean isPedidoExpresso() {
        return pedidoExpresso;
    }

    public void setPedidoExpresso(boolean pedidoExpresso) {
        this.pedidoExpresso = pedidoExpresso;
    }
    
    @Override
    public String toString(){
        return String.format("Pedido: %d\nLoja: %s\nCliente: %s\nData: %s\nPreço: %.2f\nPedido Expresso: %s\nItems: %s\n", 
        this.id, this.storeId, this.clientId, this.orderDateTime, this.getPrice(), this.pedidoExpresso ? "Sim" : "Não", this.items);
    }

    @Override
    public int compareTo(Order o) {
        return this.id - o.getId();
    }
}
