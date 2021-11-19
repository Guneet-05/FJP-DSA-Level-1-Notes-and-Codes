package Functions_and_Arrays.Codes;

import java.util.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int ans = anyBaseToAnyBase(n, sourceBase, destBase);
        scn.close();

        System.out.println(ans);
    }

    public static int getValueInBase(int n, int b) {
        // write code here

        int ans = 0;
        int p = 1;
        while (n != 0) {
            int rem = n % b;
            ans += rem * p;
            p = p * 10;
            n = n / b;
        }

        return ans;
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here

        int ans = 0;
        int p = 0;
        while (n != 0) {
            int d = n % 10;
            ans += d * Math.pow(b, p);
            p++;
            n = n / 10;
        }

        return ans;
    }

    public static int anyBaseToAnyBase(int n, int sourceBase, int destBase) {
        int dec = getValueIndecimal(n, sourceBase);
        int ans = getValueInBase(dec, destBase);

        return ans;
    }
}
