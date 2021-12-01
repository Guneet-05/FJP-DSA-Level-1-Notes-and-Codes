package Contest.FJP_Unofficial.Contest0;

import java.util.*;
public class SlowTom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); 
         while(t-- > 0) {
             int x = scn.nextInt();
             int m = scn.nextInt();
             int d = scn.nextInt();
             
             System.out.println(Math.min(x*m,x+d));
         }
         scn.close();
     }
}
