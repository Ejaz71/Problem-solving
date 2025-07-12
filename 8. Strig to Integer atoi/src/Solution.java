public class Solution {
    public static void main(String[] args) {
        String s = "";
        System.out.println(s + "  " + myAtoi(s));
    }

    static int myAtoi(String s) {
        //ignore 0s
        int i = 0, sign = 0;
        if (s == "") return 0;
        while (s.charAt(i) == ' ') {
            i++;
        }
        if (s.charAt(i) == '-') {
            sign = 1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        
        char c = s.charAt(i);
        if (!(c >= '0' && c <='9') ) return 0;

        StringBuffer num = new StringBuffer();
        if (sign == 1) num.append('-');
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            num.append(s.charAt(i));
            i++;
        }
        try {
            long ans = Integer.parseInt(num.toString());
            if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return (int) ans;
        } catch (NumberFormatException e) {
            if (sign == 0) return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
    }
}
