package Patterns.Codes;

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n = scn.nextInt();
        scn.close();
        int k = (n / 2) + 1;

        for (int i = 1; i <= k; i++) {

            for (int j = 1; j <= k - i + 1; j++) {
                System.out.print("*\t");
            }

            for (int sp = 1; sp <= 2 * i - 1; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= k - i + 1; j++) {
                System.out.print("*\t");
            }

            System.out.println();
        }

        int dec_counter = n - 2;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*\t");
            }

            for (int sp = 1; sp <= dec_counter; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*\t");
            }

            dec_counter -= 2;
            System.out.println();
        }
    }
}