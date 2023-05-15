package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedList;

public class CollectionTester {
    final static int DIMS[] = { 1000, 5000, 10000, 20000, 40000, 100000 };

    public static void main(String[] args) {
        String linha = "_________________________________________________________________________________________";
        System.out.println(linha);
        System.out.print("Collection\t");
        for (int i = 0; i < DIMS.length; i++)
            System.out.printf("%10d", DIMS[i]);

        printFormatado(new ArrayList<>());

        printFormatado(new LinkedList<>());

        printFormatado(new TreeSet<>());

        printFormatado(new HashSet<>());

        System.out.println(linha);
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        double valores[] = new double[3];
        // Add
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++)
            col.add(i);

        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert to milliseconds
        valores[0] = delta;

        // Search
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            if (!col.contains(n))
                System.out.println("Not found???" + n);
        }

        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
        valores[1] = delta;

        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
        valores[2] = delta;

        return valores;
    }

    static void printFormatado(Collection<Integer> col) {
        double[][] valores = new double[3][6];
        double[] valores2 = new double[3];
        
        for (int i = 0; i < 6; i++) {
            valores2 = checkPerformance(col, DIMS[i]);
            for (int j = 0; j < 3; j++)
                valores[j][i] = valores2[j];
        }
        System.out.println("\n" + col.getClass().getSimpleName() + "\t");
        System.out.print("Add:    \t");

        for (int i = 0; i < 6; i++)
            System.out.printf("%10.1f", valores[0][i]);

        System.out.println();
        System.out.print("Search:    \t");

        for (int i = 0; i < 6; i++)
            System.out.printf("%10.1f", valores[1][i]);

        System.out.println();
        System.out.print("Remove:    \t");

        for (int i = 0; i < 6; i++)
            System.out.printf("%10.1f", valores[2][i]);

        System.out.println();
    }
}
