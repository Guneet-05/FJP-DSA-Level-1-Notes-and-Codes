package Functions_and_Arrays.Codes;

import java.util.*;

public class BarChart {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int rows = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > rows) {
                rows = arr[i];
            }
        }

        for (int i = rows; i >= 1; i--) {

            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

}