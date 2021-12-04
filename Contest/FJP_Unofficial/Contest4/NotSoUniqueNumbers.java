package Contest.FJP_Unofficial.Contest4;
import java.util.*;
public class NotSoUniqueNumbers {
    public static void solve(int left, int right) {
        
        for(int i=left;i<=right;i++) {
            if(isUnique(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean  isUnique(int n) {
        int x = n;
        
        while(n > 0) {
            int digit = n%10;
            if(digit == 0) {
                return false;
            }
            if(digit !=0 && x%digit != 0){
                return false;
            }
            n /= 10;
        }
    return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int left = scn.nextInt();
        int right = scn.nextInt();
        scn.close();
        solve(left,right);
    }
}
