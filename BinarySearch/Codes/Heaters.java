package BinarySearch.Codes;

import java.util.*;
public class Heaters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int houNo = scn.nextInt();

        int[] houses = new int[houNo];
        for(int i=0;i<houses.length;i++) {
            houses[i] = scn.nextInt();
        }

        int heaNo = scn.nextInt();
        int[] heaters = new int[heaNo];

        for(int i=0;i<heaters.length;i++) {
            heaters[i] = scn.nextInt();
        }

        System.out.println(findRadius(houses, heaters));
        scn.close();
    }

    public static int lowerBound(int[] arr, int target) {

        // Ceil if the element is not present and first occ of the element if it is
        // present

        int lo = 0;
        int hi = arr.length - 1;
        int pa = arr.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                pa = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return pa;
    }
    
    public static int closest(int[] arr, int target) {
        int lb = lowerBound(arr,target);
        if(lb == arr.length) return arr[arr.length - 1];
        else if(lb == 0) return arr[0];
        else if(Math.abs(target - arr[lb]) < Math.abs(target - arr[lb - 1])) return arr[lb];
        else return arr[lb - 1];
        
    }
    
    public static int findRadius(int[] houses, int[] heaters) {
         Arrays.sort(heaters);
         
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<houses.length;i++) {
            int closestHeater = closest(heaters,houses[i]);
            max = Math.max(max,Math.abs(closestHeater- houses[i]));  
        }
        
        return max;
    }
}
