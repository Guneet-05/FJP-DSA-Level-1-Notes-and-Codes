package Recursion_on_the_way_up.Codes;

import java.util.*;
public class printKPC {
    static String[] keys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       scn.close();
       String str = scn.next();
       PrintKPC(0,str,"");
    }

    public static void PrintKPC(int idx,String input, String output) {
        
        if(idx == input.length()) {
            System.out.println(output);
            return;
            
        }
        
        for(Character ch:keys[input.charAt(idx) - '0'].toCharArray()) {
            PrintKPC(idx + 1,input, output + ch);
        }
    }
}
