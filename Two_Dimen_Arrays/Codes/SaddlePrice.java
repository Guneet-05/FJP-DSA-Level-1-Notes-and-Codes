package Two_Dimen_Arrays.Codes;

import java.util.*;

public class SaddlePrice {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for (int i = 0; i < arr.length; i++) {
            int minCol = 0;

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][minCol]) {
                    minCol = j;
                }
            }

            int maxRow = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][minCol] > arr[maxRow][minCol]) {
                    maxRow = k;
                }
            }

            if (maxRow == i) {
                System.out.println(arr[maxRow][minCol]);
                return;
            }
        }

        System.out.println("Invalid input");

    }

}