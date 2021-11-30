package Strings_StringBuilders_ArraysLists.Codes;

import java.util.Scanner;

public class StringCompression {

    public static String compression1(String str) {
        // write your code here

        String ans = "";

        int curr = 0;
        while (curr < str.length()) {

            int prev = curr - 1;
            if (prev == -1) {
                ans += str.charAt(curr);
                curr++;
                prev++;
            }

            if (str.charAt(curr) == str.charAt(prev)) {
                curr++;
                prev++;
            } else {
                ans += str.charAt(curr);
                curr++;
                prev++;
            }

        }

        return ans;
    }

    public static String compression2(String str) {
        // write your code here

        String ans = "";

        int curr = 0;

        while (curr < str.length()) {

            int count = 0;
            int next = curr;

            ans += str.charAt(curr);

            for (next = curr; next < str.length() && str.charAt(next) == str.charAt(curr); next++) {
                count++;
            }

            if (count != 1) {
                ans += count;
            }

            curr = next;

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        scn.close();
    }

}
