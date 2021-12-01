//This question is also available on leetcode by the name of shuffle the array
package Contest.FJP_Unofficial.Contest2;

import java.util.*;
public class MixTheArray {
 public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[2*n];
    
    for(int i=0;i<arr.length;i++) {
        arr[i] = scn.nextInt();
    }

    scn.close();
    shuffle(arr, n);
 }   

 public static int[] shuffle(int[] nums, int n) {
    int[] arr2 = new int[2*n];
   
   int fi = 0;
   int si = n;
   
   for(int idx = 0;idx<arr2.length;idx++) {
       if(idx % 2 == 0) {
           arr2[idx] = nums[fi];
           fi++;
       } else {
           arr2[idx] = nums[si];
           si++;
       }
   }
   
   return arr2;
}
}
