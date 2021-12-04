package Contest.FJP_Unofficial.Contest4;

import java.util.*;
public class StringEquivalents {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1 = "";
        String ans2 = "";
        
        for(String str:word1) {
            ans1 = ans1 + str;
        }
        
        for(String str:word2) {
            ans2 = ans2 + str;
        }
        
        return ans1.equals(ans2);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        String[] arr1 = new String[n];
        
        for(int i=0;i<n;i++) {
            arr1[i] = scn.next();
        }
        int m= scn.nextInt();
        String[] arr2 = new String[m];
        
        for(int i=0;i<m;i++) {
            arr2[i] = scn.next();
        }
        scn.close();
        System.out.println(arrayStringsAreEqual(arr1,arr2));
        
    }
}
