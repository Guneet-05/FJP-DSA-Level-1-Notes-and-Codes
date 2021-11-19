package Functions_and_Arrays.Codes;

import java.util.*;

public class SubSets {

    public static int convertToBinary(int n) {

        int ans = 0, p = 1;
        while (n > 0) {
            int rem = n % 2;
            n = n / 2;

            ans = ans + rem * p;
            p = p * 10;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        for (int dec = 0; dec < (int) (Math.pow(2, n)); dec++) {

            int bin = convertToBinary(dec);

            int power = (int) (Math.pow(10, n - 1));

            for (int i = 0; i < n; i++) {

                int bit = ((bin / power) % 10);
                if (bit == 1) {
                    System.out.print(arr[i] + "\t");
                } else {
                    System.out.print("-\t");
                }

                power = power / 10;
            }

            System.out.println();
        }

    }
}