package myapp;

import java.util.HashMap;
import java.util.Map;

public class StringUtilities {

    public static int countWords(String arg) {
        if (arg.length() == 0) {
            return 0;
        }
        String[] words = arg.split(" ");
        return words.length;
    }

    public static int countVowels(String arg) {
        int count = 0;
        for (char c : arg.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String arg) {
        StringBuffer reverse = new StringBuffer();
        char[] list = arg.toCharArray();
        for (int i = arg.length() - 1; i>=0; i--) {
            reverse.append(list[i]);
        }
        return reverse.toString();
    }

    public static Map<Character, Integer> characterFrequencyMap(String arg) {
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : arg.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        return map;
    }

}
