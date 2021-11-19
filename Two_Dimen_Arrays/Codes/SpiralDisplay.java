package Two_Dimen_Arrays.Codes;

import java.util.*;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        scn.close();

        int frow = 0, fcol = 0, lrow = arr.length - 1, lcol = arr[0].length - 1;
        int counter = 0;
        while (true) {

            // print left wall
            for (int i = frow; i <= lrow; i++) {
                System.out.println(arr[i][fcol]);
                counter++;
                if (counter == rows * cols) {
                    return;
                }
            }
            fcol++;

            // print bottom wall
            for (int j = fcol; j <= lcol; j++) {
                System.out.println(arr[lrow][j]);
                counter++;
                if (counter == rows * cols) {
                    return;
                }
            }
            lrow--;

            // print right wall
            for (int i = lrow; i >= frow; i--) {
                System.out.println(arr[i][lcol]);
                counter++;
                if (counter == rows * cols) {
                    return;
                }
            }
            lcol--;

            // print top wall
            for (int j = lcol; j >= fcol; j--) {
                System.out.println(arr[frow][j]);
                counter++;
                if (counter == rows * cols) {
                    return;
                }
            }
            frow++;
        }
    }
}
