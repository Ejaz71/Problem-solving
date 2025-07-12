import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String s = "abcdrabcydqwtqwyu";
        System.out.println(firstUniqChar(s));
    }

    static int firstUniqChar(String s) {
        HashMap<Character, Integer> mapCharCount = new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i ++) {
            c = s.charAt(i);
            mapCharCount.put(c, mapCharCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(mapCharCount.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    static int firstUniqChar2(String s) {
        HashMap<Character, Integer> mapCharCount = new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i ++) {
            c = s.charAt(i);
            mapCharCount.put(c, mapCharCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(mapCharCount.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
