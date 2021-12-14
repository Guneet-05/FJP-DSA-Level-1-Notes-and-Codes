package Recursion_and_Backtracking.Codes;
import java.util.*;

public class TargetSumSubsets {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        scn.close();
        printTargetSumSubsets(arr,0,"",tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int remTarget) {
        
        if(idx == arr.length) {
            if(remTarget == 0) {
                System.out.println(set + ".");
            }
            
            return;
        }
        
        //pruning
        if(remTarget < 0) {
            return;
        }
        
        printTargetSumSubsets(arr,idx+1,set + arr[idx] + ", ",remTarget - arr[idx]);
        printTargetSumSubsets(arr,idx+1,set,remTarget);
    }

}