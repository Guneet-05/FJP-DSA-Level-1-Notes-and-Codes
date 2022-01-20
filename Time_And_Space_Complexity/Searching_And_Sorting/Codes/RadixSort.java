package Time_And_Space_Complexity.Searching_And_Sorting.Codes;
// import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here
    int max = Integer.MIN_VALUE;
    for(int val: arr) max = Math.max(max,val);
    
    int digits = (int)(Math.log10(max)) + 1;
    int maxPlaceValue = (int)Math.pow(10,digits-1);
    
    for(int i=1;i<=maxPlaceValue; i*=10) {
        countSort(arr,i);
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    System.out.print("After sorting on " + exp + " place -> ");
    int size = 10;
    int[] farr = new int[size];
    
    //filling the freq array
    for(int i=0;i<arr.length;i++) {
        int idx = (arr[i]/exp)%10;
        farr[idx]++;
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
        prefixSum[(arr[i]/exp)%10]--;
        int idx = prefixSum[(arr[i]/exp)%10];
        res[idx] = arr[i];
    }
    
    for(int i=0;i<arr.length;i++) {
        arr[i] = res[i];
    }
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
    scn.close();
  }

}