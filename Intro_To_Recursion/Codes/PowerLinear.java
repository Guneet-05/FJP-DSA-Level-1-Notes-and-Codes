package Intro_To_Recursion.Codes;

import java.util.*;
public class PowerLinear {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int p=scn.nextInt();
        scn.close();
        int ans=power(n,p);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        
        if(n==0)
        {
            return 1;
        }
        
        return x*power(x,n-1);
    }
}
