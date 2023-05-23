package Teste_na_aula;

import java.util.TreeSet;

public class OrderManager {
    static TreeSet<Order> pedidos;

    public OrderManager(){
        pedidos = new TreeSet<>();
    }

    public void addOrder(Order order){
        pedidos.add(order);
    }

    public Order searchOrder(int id){
        Order order = null;
        for (Order o : pedidos) {
            if (o.getId() == id) {
                order = o;
            }
        }
        return order;
    }

    public void removeOrder(int id){
        Order order = searchOrder(id);
        if (order != null) {
            pedidos.remove(order);
            System.out.println("Pedido removido com sucesso");
        }
        else
            System.out.println("Pedido não encontrado");
    }

    public double calculateOrderCost(int id){
        double price = -1.0;
        Order order = searchOrder(id);
        if (order != null) {
            StandardOrderCostCalculator socc = new StandardOrderCostCalculator();
            price = socc.calculateOrderCost(order);
        }
        return price;
    }

    public void printAllOrders(){
        System.out.println("Lista de pedidos:");
        for (Order o : pedidos) {
            System.out.println(o);
        }
    }
    
}
