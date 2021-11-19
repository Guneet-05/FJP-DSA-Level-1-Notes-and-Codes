package Two_Dimen_Arrays.Codes;

import java.util.*;

public class StateOfWakanda2 {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = rows;

        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        scn.close();
        // gap strategy
        for (int gap = 0; gap < cols; gap++) {
            // gap signifies j - i
            for (int i = 0, j = gap; j < cols; i++, j++) {
                System.out.println(mat[i][j]);
            }
        }
    }

}