//This question is also on LeetCode by the name of Unique occurences

package Contest.FJP_Unofficial.Contest3;

import java.util.*;
public class DistinctOccurences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        
        int count = 0;
        for(int i=0;i<n;i++) {
            count = 0;
            for(int j=0;j<n;j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            freq[i] = count; 
        }
        
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(freq[j] == freq[i] && arr[i] != arr[j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
