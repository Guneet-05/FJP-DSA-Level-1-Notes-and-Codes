package Intro_To_Recursion.Codes;

import java.util.*;
public class PrintInc {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    scn.close();
    printInc(n);
   }    

   public static void printInc(int n) {
       if(n == 0) return;

       printInc(n-1);
       System.out.println(n);
   }
}
