package Functions_and_Arrays.Codes;

import java.io.*;

public class ReverseAnArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a) {
        // write your code here
        int l = 0;
        int h = a.length - 1;

        while (l < h) {
            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }

}