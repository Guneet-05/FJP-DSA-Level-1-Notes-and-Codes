package Patterns.Codes;

import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.close();  
         // write ur code here
         int n = scn.nextInt();
        int dec_counter = 2*n-3;
         for(int i=1;i<=n;i++) {
    
             for(int j=1;j<=i;j++) {
                 System.out.print(j + "\t");
             }
    
             for(int sp=1;sp<=dec_counter;sp++) {
                 System.out.print("\t");
             }
    
            if(i != n) {
            
              for(int j=i;j>=1;j--) {
                  System.out.print(j + "\t");
              }
    
            } else {
                for(int j=i-1;j>=1;j--) {
                    System.out.print(j + "\t");
                }
            }
     
             dec_counter -= 2;
             System.out.println();
         }
     }
}
