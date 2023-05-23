package Teste_na_aula;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class OrderTester {
    public static void main(String[] args) throws IOException{
        OrderManager manager = new OrderManager();
        ArrayList<Item> items1 = new ArrayList<>();
        ArrayList<Item> items2 = new ArrayList<>();

        items1.add(new Item("Coca-Cola", 4));
        items1.add(new Item("Pepsi", 2.5));
        items1.add(new Item("Fanta", 39));
        items1.add(new Item("Sprite", 14));

        items2.add(new Item("Coca-Cola", 4));
        items2.add(new Item("Fanta", 2.5));
        items2.add(new Item("Sprite", 12));

        manager.addOrder(new Order("1", "200", items1, "2021-05-01", false));
        manager.addOrder(new Order("2", "300", items2, "2021-05-01", true));
        manager.addOrder(new Order("1", "200", items1, "2021-05-01", true));

        manager.printAllOrders();

        manager.removeOrder(1);
        manager.removeOrder(5);

        System.out.println();

        manager.printAllOrders();
        
        Order pedidoSearchTeste = manager.searchOrder(2);
        System.out.println("Teste de procurar pedido:");
        System.out.println(pedidoSearchTeste);
        System.out.println();

        loadPedidos("pedidos.txt", manager);

        manager.printAllOrders();

        System.out.println();
        
        Double testeCalcularPreco = manager.calculateOrderCost(12);
        System.out.println("Teste de calcular preço:");
        System.out.println(testeCalcularPreco);
        System.out.println();
        System.out.println(manager.searchOrder(12));

        System.out.println();

        Double testeCalcPrecoNExiste = manager.calculateOrderCost(100000);
        System.out.println("Teste de calcular preço de pedido que não existe:");
        System.out.println(testeCalcPrecoNExiste);
        System.out.println();



    }

    private static void loadPedidos(String filename, OrderManager manager) throws IOException{
        ArrayList<String> pedidos5 = new ArrayList<>();
        Scanner input = new Scanner(new FileReader(filename, StandardCharsets.UTF_8));
        input.useDelimiter("[;\\n]+");
        input.nextLine();
        while(input.hasNext()){
            String word = input.next().strip();
            pedidos5.add(word);
        }
        for (int i=0; i<pedidos5.size(); i+=5){
            String idClient = pedidos5.get(i);
            String idLoja = pedidos5.get(i+1);
            ArrayList<Item> items = new ArrayList<>();
            String[] itemsString = pedidos5.get(i+2).split("\\|");
            for (int j=0; j<itemsString.length; j++){
                String[] itemai = itemsString[j].split(":");
                if (itemai.length == 2){
                items.add(new Item(itemai[0], Double.parseDouble(itemai[1])));
            }
            }
            String data = pedidos5.get(i+3).split(" ")[0];
            Boolean expresso = pedidos5.get(i+4).equals("expresso");
            manager.addOrder(new Order(idClient, idLoja, items, data, expresso));
        }
        input.close();
    }

   

    
}
