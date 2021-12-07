import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
    }
    scn.close();
    
    barChart(arr);
 }
 
 public static void barChart(int[] arr) {
    int Max = max(arr);
    int n = arr.length;
    
    for(int i=Max; i>=1 ;i--) {
        for(int j=0;j<n;j++) {
            if(arr[j] >= i) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }
 
 public static int max(int[] arr) {
    
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
 }

}