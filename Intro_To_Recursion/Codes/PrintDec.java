package Intro_To_Recursion.Codes;

import java.util.*;
public class PrintDec {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printDec(n);
    }

    public static void printDec(int n) {
        
        if(n == 0) return;
        
        System.out.println(n);
        printDec(n-1);
    }
}
