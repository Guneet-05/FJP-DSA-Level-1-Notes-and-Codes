package Functions_and_Arrays.Codes;

import java.util.*;

public class AnyBaseAdd {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {

        int ans = 0, multiplier = 1;
        int ca = 0;

        while (n1 > 0 || n2 > 0 || ca > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int temp = d1 + d2 + ca;
            int digit = 0;

            if (temp >= b) {
                digit = temp % b;
                ca = temp / b;
            } else {
                digit = temp;
                ca = 0;
            }

            ans += digit * multiplier;
            multiplier *= 10;
            n1 /= 10;
            n2 /= 10;
        }

        return ans;
    }
}
