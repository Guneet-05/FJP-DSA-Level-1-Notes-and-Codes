//This problem is from GFG and the name is Transition Point only.
package BinarySearch.Codes;

import java.util.*;
public class TransitionPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();
        System.out.println(transitionPoint(arr));
    }
    
    //first occurence of 1
    //the question can also be asked as how many number of 0s are there before 1s start (modification of this problem)
    public static int transitionPoint(int[] arr) {
        int pa = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi) {
            int mid = lo +(hi-lo)/2;

            if(arr[mid] == 0) {
                lo = mid + 1;
            } else {
               pa = mid;
               hi = mid - 1;
            }
        }
        return pa;
    }
}
