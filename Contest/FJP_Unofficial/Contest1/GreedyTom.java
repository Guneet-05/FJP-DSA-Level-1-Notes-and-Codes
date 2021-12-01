package Contest.FJP_Unofficial.Contest1;

import java.util.*;
public class GreedyTom {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        
        while(t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            
            int max = Integer.MIN_VALUE;
            for(int i=2;i<=k;i++) {
                int rem = n%i;
                if(rem > max) {
                    max = rem;
                }
            }
            if(k == 1) {
                System.out.println("0");
            } else {
              System.out.println(max);
            }
        }

        scn.close();
    }
}
