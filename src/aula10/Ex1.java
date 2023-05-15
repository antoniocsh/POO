package aula10;

import java.util.Map;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();

        books.put("Autobiography", new Book("Twin Fantasy", "Car Seat Headrest", 2011));
        books.put("Comedy", new Book("10,000 gecs", "100 gecs", 2023));
        books.put("Action", new Book("Greatest Hits", "Waterparks", 2021));
        books.put("Romance", new Book("Romance is Boring", "Los Campesinos!", 2010));
        books.put("Horror", new Book("The Black Parade", "My Chemical Romance", 2006));
        books.put("Drama", new Book("Monomania", "Car Seat Headrest", 2013));

        books.remove("Drama");
        books.replace("Horror", new Book("Three Cheers for Sweet Revenge", "My Chemical Romance", 2004));

        System.out.println(books.entrySet());
        System.out.println();
        System.out.println(books.keySet());
        System.out.println();
        System.out.println(books.values());

    }

}
