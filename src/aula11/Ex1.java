package aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Map<String, TreeMap<String, Integer>> wordPar = new TreeMap<>();
        ArrayList<String> wordsMais2 = new ArrayList<>();

        Scanner input = new Scanner(new FileReader("major.txt"));
        input.useDelimiter("[\\s\\t\\n.,:'‘’;?!-*{}=+&/\\(\\)\\[\\]”“\"\\']+");
        while (input.hasNext()) {
            String word = input.next();

            if (word.length() > 2) {
                wordsMais2.add(word.toLowerCase());
            }
        }

        for (int i = 0; i < wordsMais2.size(); i++) {
            String wordAgora = wordsMais2.get(i);
            if (i == wordsMais2.size() - 1) {
                break;
            }
            String wordDepois = wordsMais2.get(i + 1);
            if (wordPar.containsKey(wordAgora)) {
                Map<String, Integer> wordDepoisMap = wordPar.get(wordAgora);
                if (wordDepoisMap.containsKey(wordDepois)) {
                    int count = wordDepoisMap.get(wordDepois);
                    wordDepoisMap.put(wordDepois, count + 1);
                } else {
                    wordDepoisMap.put(wordDepois, 1);
                }
            } else {
                TreeMap<String, Integer> wordDepoisMap = new TreeMap<>();
                wordDepoisMap.put(wordDepois, 1);
                wordPar.put(wordAgora, wordDepoisMap);
            }

        }
        for (int i = 0; i < wordPar.size(); i++) {
            System.out.println(wordPar.entrySet().toArray()[i].toString());

        }
    }

}
