package Recursion_With_ArrayLists.Codes;

import java.util.*;
public class getSubsequence {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> subsets = gss(0,str);
        
        scn.close();
        System.out.println(subsets);
        
    }

    public static ArrayList<String> gss(int idx,String str) {
        if(idx == str.length()) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> smallAns = gss(idx + 1, str);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(String s: smallAns) {
            ans.add(s);
        }
        
        for(String s: smallAns) {
            ans.add(str.charAt(idx) + s);
        }
        
        return ans;
    }
}
