package Contest.FJP_Unofficial.Contest0;

import java.util.*;
public class NeverSquad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        
        while(t-- > 0) {
            int n = scn.nextInt();
            
            int count = 0;
            while(n>0) {
                int rem = n%10;
                n = n/10;
                if(rem == 4) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scn.close();
    }
}
