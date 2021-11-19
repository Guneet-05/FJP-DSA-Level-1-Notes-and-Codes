package Functions_and_Arrays.Codes;

import java.util.*;

public class DiffOf2Arrays {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();

        int[] a2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        scn.close();

        int[] ans = new int[n2];
        int i1 = a1.length - 1, i2 = a2.length - 1, i3 = ans.length - 1;
        int borrow = 0;
        while (i3 >= 0) {

            int a1val = i1 >= 0 ? a1[i1] : 0;
            if (a2[i2] - a1val + borrow >= 0) {
                ans[i3] = a2[i2] - a1val + borrow;
                borrow = 0;
            } else {
                ans[i3] = a2[i2] - a1val + borrow + 10;
                borrow = -1;
            }

            i1--;
            i2--;
            i3--;
        }

        int idx = 0;
        while (idx < ans.length) {
            if (ans[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        if (idx < ans.length) {
            for (int i = idx; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }

    }

}