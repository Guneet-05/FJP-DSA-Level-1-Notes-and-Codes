package Patterns.Codes;

import java.util.*;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n =scn.nextInt();
         scn.close();
        for(int i=1;i<=n;i++) {
            if(i<= n/2) {
               if(i==1) {
                   for(int j=1;j<=(n/2)+1;j++) {
                       System.out.print("*\t");
                   }
    
                   for(int sp=1;sp<=(n/2)-1;sp++) {
                       System.out.print("\t");
                   }
    
                   System.out.println("*");
               } else {
                   for(int sp=1;sp<=(n/2);sp++) {
                       System.out.print("\t");
                   }
                   System.out.print("*\t");
                   for(int sp=1;sp<=(n/2)-1;sp++) {
                       System.out.print("\t");
                   }
                   System.out.println("*");
    
               }
            } else if(i==(n/2) + 1) {
               for(int j=1;j<=n;j++) {
                   System.out.print("*\t");
               }
               System.out.println();
            } else {
               System.out.print("*\t");
    
               for(int sp=1;sp<=(n/2)-1;sp++) {
                   System.out.print("\t");
               }
               
               if(i==n) {
                  for(int j=1;j<=(n/2)+1;j++) {
                      System.out.print("*\t");
                  }
               } else {
                   System.out.print("*\t");
               }
               System.out.println();
            }
        }
     }
}
