
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c,0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            c = t.charAt(i);
            if(!charCountMap.containsKey(c)) return false;
            charCountMap.put(c, charCountMap.get(c)-1);
        }
        for (Map.Entry<Character, Integer> e : charCountMap.entrySet()) {
            if(e.getValue() != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "";
        String t = "";
        System.out.println(isAnagram(s,t));
        Set<Integer> set = new HashSet<>();
    }
}