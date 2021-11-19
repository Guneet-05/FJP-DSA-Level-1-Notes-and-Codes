package Functions_and_Arrays.Codes;

import java.util.*;

public class AnyBaseSub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int ans = 0, multiplier = 1;
        int borrow = 0;

        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int temp = d2 - d1 + borrow;

            if (temp < 0) {
                ans += (temp + b) * multiplier;
                borrow = -1;
            } else {
                ans += temp * multiplier;
                borrow = 0;
            }

            multiplier *= 10;
            n1 /= 10;
            n2 /= 10;
        }

        return ans;
    }
}
