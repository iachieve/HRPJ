package practice.algorithm.strings;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("aardvark", "apple").equals("YES"));
        System.out.println(twoStrings("beetroot", "sandals").equals("NO"));
        System.out.println(twoStrings("hello", "world").equals("YES"));
        System.out.println(twoStrings("hi", "world").equals("NO"));
    }

    private static String twoStrings(String s1, String s2) {
        Map<Character, Boolean> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.putIfAbsent(s1.charAt(i), true);
        }
        for (int i = 0; i < s2.length(); i++) {
            if(map1.getOrDefault(s2.charAt(i), false)) return "YES";
        }
        return "NO";
    }
}
