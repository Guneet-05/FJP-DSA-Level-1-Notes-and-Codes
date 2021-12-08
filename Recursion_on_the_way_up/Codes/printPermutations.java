package Recursion_on_the_way_up.Codes;

import java.util.*;
public class printPermutations {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        PrintPermutations(str,"");
     }
 
     public static void PrintPermutations(String str, String asf)     {
         if(str.length() == 0) {
             System.out.println(asf);
             return;
         }
         
         for(int i=0;i<str.length();i++) {
             String newInput = str.substring(0,i) + str.substring(i+1);
             PrintPermutations(newInput,asf + str.charAt(i));
         }
     }
 
}
