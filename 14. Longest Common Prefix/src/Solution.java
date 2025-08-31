class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() < len) len = strs[i].length();
        }
        for(int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            boolean misMatch = false;
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    misMatch = true;
                    break;
                }
            }
            if(misMatch) {
                return lcp.toString();
            }
            lcp.append(c);

        }
        return lcp.toString();
    }

    public static String lcpDivideAndConquer(String[] strs) {
        return lcpDNC(strs, 0, strs.length - 1);
    }

    private static String lcpDNC(String[] strs, int left, int right) {
        if (left == right) return strs[left];
        else if (left < right) {
            int mid = left + (right - left) / 2;
            String leftLCP = lcpDNC(strs, left, mid);
            String rightLCP = lcpDNC(strs, mid + 1, right);
            return lcp2Strings(leftLCP, rightLCP);
        }
        return "";
    }

    private static String lcp2Strings (String s1, String s2) {
        StringBuilder lcp = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        int i = 0;
        while(i < n && s1.charAt(i) == s2.charAt(i)) {
            lcp.append(s1.charAt(i));
            i++;
        }
        return lcp.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "florian", "floasdfg", "flying", "abc"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(lcpDivideAndConquer(strs));
    }
}