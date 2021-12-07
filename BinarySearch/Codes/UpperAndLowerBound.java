//Upper bound is equal to the ceil and lower bound is equal to the ceil if the elemnt is not present and if it is present then it is the first occ of the element

package BinarySearch.Codes;

import java.util.*;

public class UpperAndLowerBound {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        scn.close();
        System.out.println(lowerBound(arr, target));
        System.out.println(upperBound(arr, target));
    }

    public static int upperBound(int[] arr, int target) {
        // Ceil whether the element is present or not
        if (target >= arr[arr.length - 1]) {
            return arr.length;
        }

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo; // Ceil = low
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
}
