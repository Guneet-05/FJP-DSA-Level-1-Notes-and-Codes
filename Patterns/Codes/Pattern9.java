package Patterns.Codes;

import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i+j == n + 1 || i==j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}