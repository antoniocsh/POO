package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = new ArrayList<>();
        Set<String> wordsUnicas = new HashSet<String>();
        Scanner input = new Scanner(new FileReader("words.txt"));
        while (input.hasNext()) {
            String word = input.next().toLowerCase();

            words.add(word);
            wordsUnicas.add(word);
        }
        System.out.println(words);
        System.out.println("Total de palavras: " + words.size());
        System.out.println("Total de palavras únicas: " + wordsUnicas.size());
    }



}
