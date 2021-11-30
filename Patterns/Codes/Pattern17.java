package Patterns.Codes;

import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.close();
        // write ur code here
        int n = scn.nextInt();

        for(int i=1;i<=n;i++) {
            
            if(i <= n/2) {
                for(int sp=1;sp<=n/2;sp++) {
                    System.out.print("\t");
                }

                for(int j=1;j<=i;j++) {
                    System.out.print("*\t");
                }

                System.out.println();
            } else if(i == (n/2) + 1) {
                for(int j=1;j<=n;j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            } else {
                 for(int sp=1;sp<=n/2;sp++) {
                    System.out.print("\t");
                }

                for(int j=n-i+1;j>=1;j--) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }

    }
}
