// Done Till lecture of 10th Jan 1:13:12

package Time_And_Space_Complexity.Searching_And_Sorting.Codes;
// import java.io.*;
import java.util.*;

public class Sort01 {

  public static void sort01(int[] arr){
    //write your code here
    int left = 0;
    int right = 0;

    for(int i=0;i<arr.length;i++) {
      if(arr[i] > 0) {
        right++;
      } else {
        // int temp = arr[left];
        swap(arr,right,left);
        left++;right++;
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
    scn.close();
  }

}