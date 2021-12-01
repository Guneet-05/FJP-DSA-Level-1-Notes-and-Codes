package Contest.FJP_Unofficial.Contest1;
import java.util.*;
public class NarutoAndHisBikes {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0) {
            int n = scn.nextInt();
            
            while(n >= 4) {
                n = n - 4;
            }
            
            if(n > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scn.close();   
    }
}
