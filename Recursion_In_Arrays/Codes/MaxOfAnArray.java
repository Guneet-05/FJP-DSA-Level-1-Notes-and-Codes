package Recursion_In_Arrays.Codes;

import java.util.*;
public class MaxOfAnArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(maxOfArray(arr,0));
        
    }

    public static int maxOfArray(int[] arr, int idx){
       
       if(idx == arr.length) return Integer.MIN_VALUE;
       
       int maxOfRemArray = maxOfArray(arr,idx + 1);
       int totalMax = Math.max(arr[idx],maxOfRemArray);
       
       return totalMax;
    }
}
