package Strings_StringBuilders_ArraysLists.Codes;

import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = toggleCase(str);
        System.out.println(ans);
        scn.close();
    }

    public static String toggleCase(String str) {
         
        String ans= "";
        for(int i=0;i<str.length();i++) {
            char ithCharacter = str.charAt(i);
            if(ithCharacter >= 'a' && ithCharacter <= 'z') {
                char toggeledChar = (char)(ithCharacter - 32);
                ans += toggeledChar;
            } else {
                char toggeledChar = (char)(ithCharacter + 32);
                ans += toggeledChar;
            }
        }
       
        return ans;

    }
}