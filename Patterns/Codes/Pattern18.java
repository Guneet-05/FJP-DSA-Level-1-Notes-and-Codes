package Patterns.Codes;

import java.util.*;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.close();  
         // write ur code here
         
         int n = scn.nextInt();
         int k = (n/2) + 1;
         
         int dec_counter = n-4;
         for(int i=1;i<=n/2;i++) {
             if(i == 1) {
                 for(int j=1;j<=n;j++) {
                     System.out.print("*\t");
                 }
                 System.out.println();
             } else {
                 for(int sp=1;sp<=i-1;sp++) {
                     System.out.print("\t");
                 }
                 System.out.print("*\t");
                
                 for(int sp=1;sp<=dec_counter;sp++) {
                     System.out.print("\t");
                 }
    
                                          
                 System.out.println("*\t");
                 dec_counter -= 2;
                 
             }
         }
    
         for(int i=1;i<=k;i++) {
    
             for(int sp=1;sp<=k-i;sp++) {
                 System.out.print("\t");
             }
    
             for(int j=1;j<=2*i-1;j++) {
                 System.out.print("*\t");
             }
    
             System.out.println();
         }
     }
}
