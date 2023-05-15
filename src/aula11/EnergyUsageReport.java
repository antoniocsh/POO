package aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EnergyUsageReport {
    private List<Customer> customers;

    public EnergyUsageReport() {
        this.customers = new ArrayList<>();
    }

    public void load(String filename) throws IOException {
        ArrayList<String> clientes = new ArrayList<>();
        Scanner input = new Scanner(new FileReader(filename));
        input.useDelimiter("[|\\n]+");
        while (input.hasNext()) {
            String word = input.next();
            clientes.add(word);
        }
        for (int i = 0; i < clientes.size(); i += 5) {
            ArrayList<Double> consumos = new ArrayList<>();
            consumos.add(Double.parseDouble(clientes.get(i + 1)));
            consumos.add(Double.parseDouble(clientes.get(i + 2)));
            consumos.add(Double.parseDouble(clientes.get(i + 3)));
            consumos.add(Double.parseDouble(clientes.get(i + 4)));
            this.customers.add(new Customer(Integer.parseInt(clientes.get(i)), consumos));
        }
        input.close();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public Customer getCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        System.out.println("Customer not found!");
        return null;
    }

    public void removeCustomer(int customerId) {
        Customer customer = getCustomer(customerId);
        if (customer != null) {
            this.customers.remove(customer);
            System.out.println("Customer removed");
        }
    }

    public double calculateTotalUsage(int customerId) {
        double totalUsage = 0;
        Customer customer = getCustomer(customerId);
        for (Double usage : customer.getMeterReadings()) {
            totalUsage += usage;
        }
        return totalUsage;
    }

    public void generateReport(String filename) {
        try {
            FileWriter fileW = new FileWriter(filename);
            PrintWriter printW = new PrintWriter(fileW);
            
            printW.write("Customer ID | Meter Readings\n");

            for (Customer customer : customers) {
                String line = String.format("%11d | %.0f", customer.getCustomerId(),
                        calculateTotalUsage(customer.getCustomerId()));
                printW.write(line);
                printW.write("\n");
            }

            printW.close();
            fileW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}