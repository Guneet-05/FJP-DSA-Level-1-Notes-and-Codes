//This is GFG problem called "Number of Occurence"

package BinarySearch.Codes;

import java.util.*;
public class CountOccurences {
    static int count(int[] arr, int x) {
        // code here
        if(firstIndex(arr,x) == -1) {
            return 0;
        }
        
        return lastIndex(arr,x) - firstIndex(arr,x) + 1;
    }
     private static int firstIndex(int nums[], int target) {
        
        int lo = 0;
        int hi = nums.length-1;
        int pa = -1;
        while(lo <= hi) {
          int mid = lo + (hi - lo)/2;
            
          if(nums[mid] == target) {
              pa = mid;
              hi = mid - 1;
          } else if(nums[mid] > target) {
              hi = mid - 1;
          } else {
              lo = mid + 1;
          }
        }
        
        return pa;
        
    }
    private static int lastIndex(int nums[], int target) {
        
        int lo = 0;
        int hi = nums.length-1;
        int pa = -1;
        while(lo <= hi) {
          int mid = lo + (hi - lo)/2;
            
          if(nums[mid] == target) {
              pa = mid;
              lo = mid + 1;
          } else if(nums[mid] > target) {
              hi = mid - 1;
          } else {
              lo = mid + 1;
          }
        }
        
        return pa;
        
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();

         int[] arr = new int[n];

         for(int i=0;i<n;i++) {
             arr[i] = scn.nextInt();
         }

         int target = scn.nextInt();
         scn.close();
         count(arr,target);
    }
}

