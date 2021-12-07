//Available on LeetCode by the name of Binary Search
package BinarySearch.Codes;

import java.util.*;
public class BinarySearchAlgo {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       
       int[] arr = new int[n];

       for(int i=0;i<n;i++) {
           arr[i] = scn.nextInt();
       }

       scn.close();
       int target = scn.nextInt();
       System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
          
         while(left <= right) {
             int mid = (left + right)/2;
             
             if(nums[mid] == target) {
                 return mid;
             } else if(nums[mid] < target) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         } 
          
         return -1; //search unsuccessful 
      }
}
