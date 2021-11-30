package Patterns.Codes;

import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();
        int count=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }

    }
}
