package Contest.FJP_Unofficial.Contest4;

import java.util.*;

public class FindLeastIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int idx = -1;
        for(int i=0;i<n;i++) {
            if(i%10 == arr[i]) {
                idx = i;
                break;
            }
        }
        scn.close();
        System.out.println(idx);
    }
}