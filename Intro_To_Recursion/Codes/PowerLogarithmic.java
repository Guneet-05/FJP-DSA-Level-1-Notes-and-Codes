package Intro_To_Recursion.Codes;

import java.util.*;
public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int p=scn.nextInt();
        scn.close();
        int ans=power(n,p);
        System.out.println(ans);
    }

    public static int power(int x, int n) {
        
        if(n == 0) return 1;

        int pxnby2 = power(x, n/2); //call this only once else it will be O(n) only
        
        if(n%2 == 0) {
            return pxnby2*pxnby2;
        }

        return x*pxnby2*pxnby2;
    }
}
