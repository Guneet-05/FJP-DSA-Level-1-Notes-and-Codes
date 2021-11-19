package Functions_and_Arrays.Codes;

import java.util.*;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int ans = 0, p = 0;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;

            ans += d * Math.pow(b, p);
            p++;
        }
        return ans;
    }

}
