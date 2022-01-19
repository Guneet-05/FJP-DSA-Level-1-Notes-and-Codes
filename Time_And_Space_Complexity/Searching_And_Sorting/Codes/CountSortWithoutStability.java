package Time_And_Space_Complexity.Searching_And_Sorting.Codes;
// import java.io.*;
import java.util.*;

public class CountSortWithoutStability {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
    //Since max and min is already given we don't perform the first iteration
    
    int size = max - min + 1;
    int[] farr = new int[size];
    
    for(int i=0;i<arr.length;i++) {
        farr[arr[i] - min]++;
    }
    
    int j = 0;
    for(int i=0;i<farr.length;i++) {
        for(int k=0;k<farr[i];k++) {
            arr[j] = i + min;
            j++;
        }
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