package Contest.FJP_Unofficial.Contest1;

import java.util.*;
public class HollowRhombusStarPattern {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int i=1;i<=n;i++) {
            
            for(int sp=1;sp<=n-i;sp++) {
                System.out.print(" ");
            }
            
            if(i == 1 || i==n) {
                for(int j=1;j<=n;j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                 System.out.print("*");
                
                for(int sp=1;sp<=n-2;sp++) {
                    System.out.print(" ");
                }
                
                System.out.println("*");
            }
        }
        
    }
}
