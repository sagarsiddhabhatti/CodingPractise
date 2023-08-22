package StringCode;

import java.util.*;

/**
 * - Common Anagrams
 * Input- {“cat”, “dog”, “tac”, “god”, “act”}
 * Output - [[cat,tac,act], [dog,god]]
 */
public class CommonAnagrams {

    public static void main(String args[]) {

        List<String> input = new ArrayList<>();

        input.add("cat");
        input.add("dog");
        input.add("tac");
        input.add("god");
        input.add("act");

        Map<String, List<String>> output = new HashMap();

        for (String s : input) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray); // Using the char array constructor is more efficient

            output.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // Print the grouped anagramskonda

            System.out.println(output.values());




    }


}

