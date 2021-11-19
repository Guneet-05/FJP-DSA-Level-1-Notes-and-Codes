package Functions_and_Arrays.Codes;

import java.util.*;

public class SpanOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
    }
    scn.close();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0;i<n;i++) {
        if(arr[i] > max) {
            max = arr[i];
        } 
        if(arr[i] < min) 
        {
            min = arr[i];
        }
    }

    System.out.println(max - min);
 }

}