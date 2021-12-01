package Contest.FJP_Unofficial.Contest2;

import java.util.*;
public class ZeroMovement {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        scn.close();
        moveZeroes(arr);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZeroes(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] != 0) {
                    break;
                } else {
                    if(arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        
    }
}
