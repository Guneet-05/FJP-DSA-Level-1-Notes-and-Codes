import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];

    for(int i=0;i<arr.length;i++) {
        arr[i] = scn.nextInt();
    }

    scn.close();
    // display(arr, 0);
    // System.out.println("\n");
    // displayReverse(arr, 0);
    // System.out.println(max(arr, 0));
    System.out.println(firstIndex(arr, 1, 0));
    System.out.println(lastIndex(arr, 1, arr.length - 1));
 }

 public static void display(int[] arr, int idx) {

    if(idx == arr.length) return;

    System.out.println(arr[idx]);
    display(arr,idx+1);
 }

 public static void displayReverse(int[] arr, int idx) {
    if(idx == arr.length) return;
    
    displayReverse(arr,idx+1);
    System.out.println(arr[idx]);
 }

 public static int max(int[] arr, int idx) {

    if(idx == arr.length) return Integer.MIN_VALUE;

    int maxOfROE = max(arr,idx + 1);
    if(arr[idx] > maxOfROE) return arr[idx];

    return maxOfROE;
 }

 public static int firstIndex(int[] arr,int target, int idx) {
    
    if(idx == arr.length) {
        return -1;
    }

    if(arr[idx] == target) return idx;

    return firstIndex(arr, target, idx + 1);
 }

 public static int lastIndex(int[] arr, int target, int idx) {

    if(idx == -1) return idx;

    if(arr[idx] == target) return idx;
    return lastIndex(arr,target,idx-1);
 }

}