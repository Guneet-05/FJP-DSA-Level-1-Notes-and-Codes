//This question is also available on leetcode by the name of Spiral Matrix 2

package Contest.FJP_Unofficial.Contest2;

import java.util.*;
public class ReturnOfSpiral {
    public static void solve(int[][] arr) {
        int n = arr.length;
             
        int fr = 0, fc = 0, lr = n-1, lc = n-1;
        int count = 1;
        while(true) {
            
            //top wall
            for(int j=fc;j<=lc;j++) {
                arr[fr][j] = count;
                count++;
                if(count == n*n + 1) {
                    return;
                }
            }
            fr++;
            
            //right wall
            for(int i=fr;i<=lr;i++) {
                arr[i][lc] = count;
                count++;
                if(count == n*n + 1) {
                    return;
                }
            }
            lc--;
            
            //bottom wall
            for(int j=lc;j>=fc;j--) {
                arr[lr][j] = count;
                count++;
                if(count == n*n + 1) {
                    return;
                }
            }
            lr--;
            
            //left wall
            for(int i=lr;i>=fr;i--) {
                arr[i][fc] = count;
                count++;
                if(count == n*n +1) {
                    return;
                }
            }
            fc++;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();     
        int[][] arr = new int[n][n];
   
        solve(arr);
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
