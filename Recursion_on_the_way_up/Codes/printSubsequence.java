package Recursion_on_the_way_up.Codes;

import java.util.*;
public class printSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        printSS(0,str,"");
    }
 
    public static void printSS(int idx,String input, String output) {
        
        if(idx == input.length()) {
            System.out.println(output);
            return;
        }
        
        char ch = input.charAt(idx);
        
        //yes
        printSS(idx + 1,input, output + ch);
        
        //no
        printSS(idx + 1, input, output);
    }

}
