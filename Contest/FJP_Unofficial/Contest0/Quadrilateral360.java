//This question is also available on codechef by the name of cyclic quadrilateral
package Contest.FJP_Unofficial.Contest0;

import java.util.*;
public class Quadrilateral360 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
            
            if(a + c == 180 && b+d == 180) {
              System.out.println("yes");   
            } else {
                System.out.println("no");
            }
        }

        scn.close();
    }
}
