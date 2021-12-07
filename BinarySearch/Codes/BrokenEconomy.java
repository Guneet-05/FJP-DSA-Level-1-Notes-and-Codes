package BinarySearch.Codes;

import java.util.*;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }

        int target = scn.nextInt();
        scn.close();

        if (ceil(arr, target) == floor(arr, target)) {
            System.out.println(ceil(arr, target));
        } else {
            System.out.println(ceil(arr, target));
            System.out.println(floor(arr, target));
        }

        // System.out.println(Ceil(arr, target));
    }

    // These ceil and floor methods are written as per the question requirement that
    // is if the denomination is present, we have to return the denomination itself
    public static int ceil(int[] arr, int target) {

        int pa = -1;
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                pa = mid;
                hi = mid - 1;
            }
        }

        return arr[pa];
    }

    public static int floor(int[] arr, int target) {
        int pa = -1;
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                pa = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return arr[pa];
    }

    // The functions below are the real Ceal and Floor functions as the Ceil and
    // Floor of a Number are not equal to the number itself
    // They are strictly greater/less than the number
    public static int Ceil(int[] arr, int target) {

        if (target >= arr[arr.length - 1]) {
            return Integer.MAX_VALUE;
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

        return arr[lo]; // Ceil = low
    }

    public static int Floor(int[] arr, int target) {
        if (target <= arr[0])
            return Integer.MIN_VALUE;

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] >= target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return arr[hi]; // Floor = high
    }
}
