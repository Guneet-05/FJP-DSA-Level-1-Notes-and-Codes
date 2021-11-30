package Intro_To_Recursion.Codes;

import java.util.*;
public class PrintZigZag {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();   
        pzz(n);
    }

    public static void pzz(int n){
        if(n == 0) return;
        
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
    }
}
