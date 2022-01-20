package Time_And_Space_Complexity.Searching_And_Sorting.Codes;
// import java.io.*;
import java.util.*;

public class CountSortWithStability {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
    //Since max and min is already given we don't perform the first iteration
    
    int size = max - min + 1;
    int[] farr = new int[size];
    
    for(int i=0;i<arr.length;i++) {
        farr[arr[i] - min]++;
    }
    
    //now create the prefix sum array
    int[] prefixSum = new int[farr.length];
    prefixSum[0] = farr[0];
    
    for(int i=1;i<prefixSum.length;i++) {
        prefixSum[i] = prefixSum[i-1] + farr[i];
    }
    
    //Iterate from the back of the array
    int[] res = new int[arr.length];
    for(int i=arr.length-1;i>=0;i--) {
        prefixSum[arr[i] - min]--;
        int idx = prefixSum[arr[i] - min];
        res[idx] = arr[i];
    }
    
    for(int i=0;i<arr.length;i++) {
        arr[i] = res[i];
    }
    
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
    scn.close();
  }

}