package Patterns.Codes;
import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();
        for(int i=1;i<=n;i++) {

            for(int sp=1;sp<=i-1;sp++) {
                System.out.print("\t");
            }

            for(int j=1;j<=n-i+1;j++) {
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}