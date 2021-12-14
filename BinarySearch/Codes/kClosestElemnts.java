package BinarySearch.Codes;

import java.util.*;

public class kClosestElemnts {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       
       int[] arr = new int[n];
       for(int i=0;i<n;i++) {
           arr[i] = scn.nextInt();
       }

       int target = scn.nextInt();
       int k = scn.nextInt();

       List<Integer> kClosest = findClosestElements(arr, k, target);
       System.out.println(kClosest);
       scn.close();
   }

    public static int lowerBound(int[] arr, int target) {

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

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> ans = new ArrayList<>();
        int second = lowerBound(arr, x);
        int first = second - 1;

        while (first >= 0 && second < arr.length && k-- > 0) {

            if (Math.abs(arr[first] - x) <= Math.abs(arr[second] - x)) {
                ans.add(arr[first]);
                first--;
            } else {
                ans.add(arr[second]);
                second++;
            }
        }

        while (first >= 0 && k-- > 0) {
            ans.add(arr[first]);
            first--;
        }

        while (second < arr.length && k-- > 0) {
            ans.add(arr[second]);
            second++;
        }

        Collections.sort(ans);
        return ans;
    }
}
