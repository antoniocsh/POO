package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> wordsMais2 = new ArrayList<>();
        ArrayList<String> wordsEndsS = new ArrayList<>();
        ArrayList<String> wordsSoLetras = new ArrayList<>();
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);

        Scanner input = new Scanner(new FileReader("words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if (word.length() > 2) {
                wordsMais2.add(word);
            }
            if (word.endsWith("s")) {
                wordsEndsS.add(word);
            }
            if (pattern.matcher(word).matches()) {
                wordsSoLetras.add(word);
            }

        }
        System.out.println();
        System.out.println(wordsMais2);
        System.out.println();
        System.out.println(wordsEndsS);
        System.out.println();
        System.out.println(wordsSoLetras);
    }

}
