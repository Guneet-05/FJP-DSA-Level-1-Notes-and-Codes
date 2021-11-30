package Intro_To_Recursion.Codes;

import java.util.*;
public class PrintDecInc {
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    scn.close();
    pdi(n);       
   }   

   public static void pdi(int n){
        
    if(n==0)
    {
        return;
    }
    
    System.out.println(n);
    pdi(n-1);
    System.out.println(n);
}

}
