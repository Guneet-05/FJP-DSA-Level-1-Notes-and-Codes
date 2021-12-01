package Contest.FJP_Unofficial.Contest0;

import java.util.*;
public class SandGlassPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int i=1;i<=n;i++) {
            for(int sp=1;sp<=i-1;sp++) {
                System.out.print(" ");
            }
            
            for(int j=1;j<=n-i+1;j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
        for(int i=2;i<=n;i++) {
            for(int sp=1;sp<=n-i;sp++) {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
