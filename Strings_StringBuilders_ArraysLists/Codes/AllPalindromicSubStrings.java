package Strings_StringBuilders_ArraysLists.Codes;

import java.util.*;

public class AllPalindromicSubStrings {
    public static boolean isPalindrome(String str) {
       
        int i = 0;
        int j = str.length() - 1;
        
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    } 
 
     public static void solution(String str){
         //write your code here
         
         for(int i=0;i<str.length();i++) {
             for(int j=i;j<str.length();j++) {
                 String subStr = str.substring(i,j+1);
                 if(isPalindrome(subStr)) {
                     System.out.println(subStr);
                 }
             }
         }
         
     }
     
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
     }
}
