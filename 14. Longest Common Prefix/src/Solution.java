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

    public static void main(String[] args) {
        String[] strs = {"flower"};
        System.out.println(longestCommonPrefix(strs));
    }
}