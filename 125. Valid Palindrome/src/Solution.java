public class Solution {
    public static void main(String[] args) {
        String s =  "race a car";
        System.out.println(isPalindrome2(s));
    }

    static boolean isPalindrome(String s) {
        int first = 0, last = s.length() -1;
        int n = s.length();
        s = s.toLowerCase();
        char c,d;
        while (first < last) {
            c = s.charAt(first); d = s.charAt(last);
            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) ) {
                first++;
                continue;
            }
            if (!((d >= 'a' && d <= 'z') || (d >= '0' && d <= '9'))) {
                last--;
                continue;
            }
            if (c != d) return false;
            else {
                first++;
                last--;
            }

        }
        return true;
    }

    static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        int n = s.length();
        s = s.toLowerCase();
        for (int i = 0 ; i < n ; i++) {
            c = s.charAt(i);
            if (((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                sb.append(c);
            }
        }

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = new StringBuilder("abc");
        System.out.println(a.equals(a) +"sdf");
        if (sb.toString().equals(sb.reverse().toString())) return true;
        return false;
    }
}
