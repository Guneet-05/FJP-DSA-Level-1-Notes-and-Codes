package Two_Dimen_Arrays.Codes;

import java.util.Scanner;

public class RotateBy90 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        rotate(arr);
        display(arr);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr, int i, int j) {

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void transpose(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                swap(arr, i, j);
            }
        }
    }

    public static void rotate(int[][] arr) {
        transpose(arr);

        for (int i = 0; i < arr.length; i++) {

            int l = 0;
            int h = arr[0].length - 1;
            while (l < h) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][h];
                arr[i][h] = temp;
                l++;
                h--;
            }
        }
    }
}
