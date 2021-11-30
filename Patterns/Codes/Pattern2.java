package Patterns.Codes;

import java.util.*;
public class Pattern2 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
