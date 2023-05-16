package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> wordsMais2 = new ArrayList<>();
        Map<Character, TreeMap<String, Integer>> iPalavra = new TreeMap<>();        
        Scanner input = new Scanner(new FileReader("words.txt"));
        input.useDelimiter("[\\s\\t\\n\\p{Punct}&&[^']]+");
        while (input.hasNext()) {
            String word = input.next().toLowerCase();
            if (word.length() > 2){
            wordsMais2.add(word);
        }
        }
        
        for (int i = 0; i < wordsMais2.size(); i++) {
            char primeiraLetra = wordsMais2.get(i).charAt(0);
            String Palavra = wordsMais2.get(i);
            if (iPalavra.containsKey(primeiraLetra)) {
                Map<String, Integer> PalavraMap = iPalavra.get(primeiraLetra);
                if (PalavraMap.containsKey(Palavra)) {
                    int count = PalavraMap.get(Palavra);
                    PalavraMap.put(Palavra, count + 1);
                } else {
                    PalavraMap.put(Palavra, 1);
                }
            } else {
                TreeMap<String, Integer> PalavraMap = new TreeMap<>();
                PalavraMap.put(Palavra, 1);
                iPalavra.put(primeiraLetra, PalavraMap);
            }

        }

        writeFile((TreeMap<Character, TreeMap<String, Integer>>) iPalavra);
        


    }

    public static void writeFile(TreeMap<Character, TreeMap<String, Integer>> AllWordsMap){
        try {
        FileWriter fileW = new FileWriter("palavras.txt");
        PrintWriter printW = new PrintWriter(fileW);
        for (Character firstLetter : AllWordsMap.keySet()) {
            printW.write(firstLetter + ": ");
            TreeMap<String, Integer> wordsMap = AllWordsMap.get(firstLetter);
            for (String word : wordsMap.keySet()) {
                printW.write(word + ", " + wordsMap.get(word) + "; ");
                
            }
            printW.write("\n");
        }


        printW.close();
        fileW.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}

