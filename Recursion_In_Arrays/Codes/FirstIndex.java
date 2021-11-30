package Recursion_In_Arrays.Codes;

import java.util.*;
public class FirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int x = scn.nextInt();
        scn.close();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length) return -1;
        
        if(arr[idx] == x) {
            return idx;
        }
        
        return firstIndex(arr,idx + 1,x);
    }
}
