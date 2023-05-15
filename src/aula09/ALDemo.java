package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import aula07.DateYMD;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println("item no 1 " + c2.get(1));
        System.out.println(c2);
        c2.set(1, "Sol");
        System.out.println(c2.contains("Sol"));
        System.out.println(c2.contains("Chuva"));
        System.out.println(c2.contains("Vento"));
        System.out.println(c2);
        c2.add("Sol");
        System.out.println(c2);
        System.out.println(c2.indexOf("Sol"));
        System.out.println(c2.lastIndexOf("Sol"));
        c2.add("Vento");
        c2.add("Nuvens");
        System.out.println(c2);
        List<String> sublista = c2.subList(1, 4); // items 1, 2 e 3 (4 não incluído)
        System.out.println(sublista);
        System.out.println();


        Set<Pessoa> c3 = new HashSet<>();

        Pessoa p1 = new Pessoa("João", 123456789, new DateYMD(1, 12, 2012));
        Pessoa p2 = new Pessoa("Maria", 987654321, new DateYMD(13, 1, 1999));
        Pessoa p3 = new Pessoa("Rita", 123454321, new DateYMD(20, 2, 2020));
        Pessoa p4 = new Pessoa("André", 100200300, new DateYMD(12, 12, 1998));
        Pessoa p5 = new Pessoa("Diogo", 745801015, new DateYMD(1, 12, 2004));

        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);

        System.out.println(c3);
        System.out.println();

        c3.add(p1);
        c3.add(null); // é permitido smhm mas no caso de TreeSet não é

        Iterator <Pessoa> it = c3.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        Set <DateYMD> c4 = new TreeSet<>();

        DateYMD d1 = new DateYMD(1, 12, 2012);
        DateYMD d2 = new DateYMD(13, 1, 1999);
        DateYMD d3 = new DateYMD(20, 2, 2020);
        DateYMD d4 = new DateYMD(12, 12, 1998);
        DateYMD d5 = new DateYMD(1, 12, 2004);
        DateYMD d6 = new DateYMD(1, 12, 2004);

        c4.add(d1);
        c4.add(d2);
        c4.add(d3);
        c4.add(d4);
        c4.add(d5);
        c4.add(d6);

        System.out.println();

        Iterator <DateYMD> it2 = c4.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }



        


    }
}