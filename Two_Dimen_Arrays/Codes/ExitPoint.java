package Two_Dimen_Arrays.Codes;

import java.util.*;

public class ExitPoint {
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
        int currRow = 0, currCol = 0, ansRow = 0, ansCol = 0;
        int direction = 0;
        while (currRow >= 0 && currRow < rows && currCol >= 0 && currCol < cols) {

            if (arr[currRow][currCol] == 1) {
                direction = (direction + 1) % 4;
            }

            ansRow = currRow;
            ansCol = currCol;

            if (direction == 0) {
                currCol++;
            } else if (direction == 1) {
                currRow++;
            } else if (direction == 2) {
                currCol--;
            } else {
                currRow--;
            }
        }

        System.out.println(ansRow);

        System.out.println(ansCol);
    }
}
