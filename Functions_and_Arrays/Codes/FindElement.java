package Functions_and_Arrays.Codes;

import java.util.*;

public class FindElement{


public static int linearSearch(int[] arr, int e) {
    
    int n = arr.length;
    for(int i=0;i<n;i++) {
       if(arr[i] == e) {
           return i;
       }
    }

    return -1;
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];

    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
    } 
  
    int ele = scn.nextInt();
    scn.close();   
    int idx = linearSearch(arr,ele);
    System.out.println(idx);
 }

}