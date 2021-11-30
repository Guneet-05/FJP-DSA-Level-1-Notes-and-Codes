package Two_Dimen_Arrays.Codes;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] mat = new int[n][m];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        rotateShell(mat,s,k);
        display(mat);
        
    }

   public static void rotateShell(int[][] arr,int s, int k) {
       
       int[] a = fillOneDFromShell(arr,s);
       rotate(a,k);
       fillShellFromOneD(arr,s,a);
   }
   
   public static int[] fillOneDFromShell(int[][] arr, int s) {
       
       int minr = s-1;
       int maxr = arr.length - s;
       int minc = s-1;
       int maxc = arr[0].length - s;
       
       int n = 2*(maxr-minr+maxc-minc);
       
       int[] oned = new int[n];
       
       //fill the array
       int count = 0;
       
       while(true) {
           
           //left wall
           for(int i=minr;i<=maxr;i++) {
               oned[count] = arr[i][minc];
               count++;
               if(count == n) {
                   return oned;
               }
           }
           minc++;
           
           //bottom wall
           for(int j=minc;j<=maxc;j++) {
               oned[count] = arr[maxr][j];
               count++;
               if(count == n) {
                   return oned;
               }
           }
           maxr--;
           
           //right wall
           for(int i=maxr;i>=minr;i--) {
               oned[count] = arr[i][maxc];
               count++;
               if(count == n) {
                   return oned;
               }
           }
           maxc--;
           
           //top wall
           for(int j=maxc;j>=minc;j--) {
               oned[count] = arr[minr][j];
               count++;
               if(count == n) {
                   return oned;
               }
           }
           minr++;
       }
       
   }
   
   public static void fillShellFromOneD(int[][] arr,int s, int[] oned) {
       int minr = s-1;
       int maxr = arr.length - s;
       int minc = s-1;
       int maxc = arr[0].length - s;
       
       int count = 0;
       int n = 2*(maxr-minr+maxc-minc);
       
       while(true) {
           
           //left wall
           for(int i=minr;i<=maxr;i++) {
               arr[i][minc] = oned[count];
               count++;
               if(count == n) {
                   return;
               }
           }
           minc++;
           
           //bottom wall
           for(int j=minc;j<=maxc;j++) {
               arr[maxr][j]= oned[count];
               count++;
               if(count == n) {
                   return;
               }
           }
           maxr--;
           
           //right wall
           for(int i=maxr;i>=minr;i--) {
               arr[i][maxc]= oned[count];
               count++;
               if(count == n) {
                   return;
               }
           }
           maxc--;
           
           //top wall
           for(int j=maxc;j>=minc;j--) {
               arr[minr][j]= oned[count];
               count++;
               if(count == n) {
                   return;
               }
           }
           minr++;
       }
   }
   
    public static void rotate(int[] arr, int k){
    // write your code here
    k=k%arr.length;
    
    if(k<0)
    {
        k=k+arr.length;
    }
    
    reverse(arr,0,arr.length-k-1);
    reverse(arr,arr.length-k,arr.length-1);
    reverse(arr,0,arr.length-1);
  }
  
  public static void reverse(int[] arr, int l,int h)
  {
      int i=l;
      int j=h;
      while(i<j)
      {
          swap(arr,i,j);
          i++;
          j--;
      }
  }
  
  public static void swap(int[] arr,int i,int j)
  {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
  }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}