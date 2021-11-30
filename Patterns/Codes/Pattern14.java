package Patterns.Codes;

import java.util.*;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();
        for(int i=1;i<=10;i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
