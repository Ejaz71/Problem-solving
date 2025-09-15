public class RecursiveMethods {
    public static void main(String[] args) {
        char[] s = {'J', 'A', 'V', 'A'};
        reverseString(s);
        System.out.println(s);
        reverseString2(s);
    }

    public static void reverseString(char[] s) {
        reverseStringHelper(s, 0, s.length - 1);
    }

    private static void reverseStringHelper (char[] s, int left, int right) {
        if (left > right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverseStringHelper(s, ++left, --right);
    }

    public static void reverseString2(char[] s) {
        reverseString2Helper(s, 0);
    }

    private static void reverseString2Helper(char[] s, int index) {
        if (s == null || index >= s.length) return;
        reverseString2Helper(s, index + 1);
        System.out.print(s[index]);
    }

}
