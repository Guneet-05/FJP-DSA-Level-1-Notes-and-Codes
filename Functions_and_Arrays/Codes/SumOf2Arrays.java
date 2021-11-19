package Functions_and_Arrays.Codes;
import java.util.*;

public class SumOf2Arrays{

public static int[] sum(int[] a, int [] b) {

    int maxLen = a.length>b.length ? a.length : b.length;
    maxLen++;
    int[] c = new int[maxLen];
    
    int i = a.length - 1;
    int j = b.length - 1;
    int k = c.length - 1;
    int ca = 0;
    while(i>=0 && j>=0) {
         
        if(a[i] + b[j] + ca < 10) {
            c[k--] = a[i--] + b[j--] + ca;
            ca = 0;
        } else {
           c[k--] = (a[i] + b[j] + ca)%10;
           ca = (a[i] + b[j] + ca)/10;
           i--;j--;
        }
    } 

    while(i >= 0) {
        if(a[i] + ca < 10) {
            c[k--] = a[i--] + ca;
            ca = 0;
        } else {
            c[k--] = (a[i] + ca) % 10;
            ca = (a[i] + ca)/10;
            i--;
        }
    }   
    
    while(j >= 0) {
        if(b[j] + ca < 10) {
            c[k--] = b[j--] + ca;
            ca = 0;
        } else {
            c[k--] = (b[j] + ca) % 10;
            ca = (b[j] + ca)/10;
            j--;
        }
    }   

    if(ca > 0) {
        c[k--] = ca;
    }

    return c;
}

public static void display(int[] arr) {

    int idx = 0; 
    if(arr[0] == 0) idx=1;

    for(int i=idx;i<arr.length;i++) {
        System.out.println(arr[i]);
    }
}

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();

    int[] arr1 = new int[n1];

    for(int i=0;i<arr1.length;i++) {
        arr1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];

    for(int i=0;i<n2;i++) {
        arr2[i] = scn.nextInt();
    }
    scn.close();
    int[] c = sum(arr1,arr2);
    display(c);
 }

}