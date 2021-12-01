//This problem is also available on leetcode by the name of Find the Highest Altitude
package Contest.FJP_Unofficial.Contest2;

import java.util.*;
public class FindThePeakPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        
        int n = gain.length;
        int max = 0;
        int sum = 0;
        
        for(int i=0;i<n;i++) {
            sum += gain[i];
            if(sum > max) {
                max = sum;
            }
        }
        
        return max;
    }
}
