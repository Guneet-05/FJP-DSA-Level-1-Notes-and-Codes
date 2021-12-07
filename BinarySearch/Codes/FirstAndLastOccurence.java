//This is a leetcode problem available by the name of "Find First And Last Position Of Element in a Sorted Array"

package BinarySearch.Codes;

import java.util.*;
public class FirstAndLastOccurence {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();

         int[] arr = new int[n];

         for(int i=0;i<n;i++) {
             arr[i] = scn.nextInt();
         }

         int target = scn.nextInt();
         scn.close();
         
         int[] ans = searchRange(arr, target);
         System.out.println(ans[0]);
         System.out.println(ans[1]);
        
    }

    public static int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        ans[0] = firstOcc(nums,target);
        ans[1] = lastOcc(nums,target);
        return ans;
    }

    public static int firstOcc(int[] arr, int target) {
          
        int lo = 0, hi = arr.length-1;
        int pa = -1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;

            if(arr[mid] == target) {
                pa = mid;
                hi = mid -1;
            } else if(arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return pa;
    }

    public static int lastOcc(int[] arr, int target) {

        int lo = 0, hi = arr.length - 1;
        int pa = -1;

        while(lo <= hi) {
            
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid] == target) {
                pa = mid;
                lo = mid + 1;
            } else if(arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return pa;

    }
}
