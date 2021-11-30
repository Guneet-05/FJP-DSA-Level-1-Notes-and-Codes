package Strings_StringBuilders_ArraysLists.Codes;

import java.util.*;

public class StringWithDiff {
    public static String solution(String str){
        // write your code here
        
        StringBuilder ans = new StringBuilder("");
        int curr = 0;
        int next = curr + 1;
        
        while(next < str.length()) {
            
            char currChar = str.charAt(curr);
            char nextChar = str.charAt(next);
            
            ans.append(currChar);
            int diff = (nextChar-currChar);
            ans.append(diff);
            
            next++;
            curr++;
        }
        ans.append(str.charAt(curr));
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(solution(str));
    }
}
