

public class Solution {
    public static void main(String[] args) {
        int x = 4568;
//        String s = String.valueOf(x);
//        System.out.println(x);
//        int y = Integer.parseInt(String.valueOf(s.toCharArray()));
//        int z = Integer.parseInt(s);
//        System.out.println(y);
//        System.out.println(z);

        System.out.println(reverse3(x));
//        System.out.println("....");
//        int a = 10111;
//        String A = String.valueOf(a);
//        String yy = String.valueOf(a);
//        System.out.println(a + " " + A + " " + yy);

    }

    public static int reverse(int x) {

        // not optimal as new string is being created in each iteration

        String s = Integer.toString(x);
        String ans = "";
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == '-') {
                ans = "-" + ans;
            } else {
                ans += s.charAt(i);
            }
        }

        //return Integer.parseInt(ans);
        try{
            return Integer.parseInt(ans);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverse2(int x) {

        // optimal then the first approach due to using sring builder.

        String s = Integer.toString(x);
        StringBuilder ans = new StringBuilder();
        if (s.charAt(0) == '-')  {
            ans.append('-');
            s = s.substring(1);
        }
        ans.append(new StringBuilder(s).reverse());


        //return Integer.parseInt(ans);
        try{
            return Integer.parseInt(ans.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    static int reverse3 (int x) {

        // most optimal due to not using string and/or string builder.

        int ans = 0, res;
        while (x != 0) {
            res = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) return 0;
            x /= 10;

            ans = ans * 10 + res;
        }
        return ans;
    }
}
