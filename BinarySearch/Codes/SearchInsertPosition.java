package BinarySearch.Codes;

import java.util.*;
public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        scn.close();
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        
        if(target > nums[nums.length-1]) return nums.length;
        
        int lo = 0;
        int hi = nums.length - 1;
        int pa = -1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) {
                lo = mid + 1;
            } else {
                pa = mid;
                hi = mid - 1;
            }
        }
        
        return pa;
    }
}
