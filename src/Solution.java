import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(twoStrings("aardvark", "apple"));
        System.out.println(twoStrings("beetroot", "sandals"));
    }

    static String twoStrings(String s1, String s2) {
        Map<Character, Boolean> map1 = new HashMap<>();
        for(int i = 0 ;i < s1.length(); i++){
            map1.putIfAbsent(s1.charAt(i), true);
        }
        for (int i = 0; i < s2.length(); i++) {
            if(map1.getOrDefault(s2.charAt(i), false)) return "YES";
        }
       return "NO";
    }
}
