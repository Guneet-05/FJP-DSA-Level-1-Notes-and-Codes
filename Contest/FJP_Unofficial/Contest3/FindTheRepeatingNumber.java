//This is also available on code chef by the name of  odd repeat
package Contest.FJP_Unofficial.Contest3;

import java.util.*;
public class FindTheRepeatingNumber {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int t =scn.nextInt();
        while(t-- > 0)  {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int s = scn.nextInt();
            
            int sum = (n*(2 + (n-1)*2)/2);
            int diff = s- sum;
            System.out.println(diff/(k-1));
        }
        scn.close();
    }
}
