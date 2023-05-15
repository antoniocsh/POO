package aula10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<Character, HashSet<Integer>> symbPos = new HashMap<>();
        String s = "Hello World!";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (symbPos.containsKey(chars[i])) {
                symbPos.get(chars[i]).add(i);
            } else {
                symbPos.put(chars[i], new HashSet<Integer>());
                symbPos.get(chars[i]).add(i);
            }
        }

        System.out.println(symbPos);

    }

}
