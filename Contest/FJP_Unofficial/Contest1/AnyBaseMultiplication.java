package Contest.FJP_Unofficial.Contest1;

import java.util.*;

public class AnyBaseMultiplication {
    public static int add(int n1, int n2, int b) {
        int c = 0;
        int ans = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = (d1 + d2 + c) % b;
            if (d1 + d2 + c >= b) {
                c = (d1 + d2 + c) / b;
            } else {
                c = 0;
            }
            ans = ans + d * p;
            p = p * 10;
        }
        return ans;
    }

    public static int helper(int b, int n1, int d2) {
        int c = 0;
        int ans = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            if (d >= b) {
                c = d / b;
            } else {
                c = 0;
            }
            d = d % b;
            ans = ans + d * p;
            p = p * 10;
        }
        return ans;
    }

    public static int mul(int b, int n1, int n2) {
        int ans = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sans = helper(b, n1, d2);
            ans = add(ans, sans * p, b);
            p = p * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = mul(b, n1, n2);
        System.out.println(ans);
        scn.close();

    }
}
