package Intro_To_Recursion.Codes;

import java.util.*;
public class Factorial {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        int f=factorial(n);
        System.out.println(f);
    }

    public static int factorial(int n){
        
        if(n==0)
        {
            return 1;
        }
        
        return n*factorial(n-1);
    }
}
