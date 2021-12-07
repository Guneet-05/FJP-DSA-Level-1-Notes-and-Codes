package Recursion_With_ArrayLists.Codes;

import java.util.*;
public class getKPC {
    static String[] keys = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.next();
       ArrayList<String> kpc = getKpc(str,0);
       scn.close();
       System.out.println(kpc);
    }

    public static ArrayList<String> getKpc(String str,int idx) {
        
        if(idx == str.length()) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> smallAns = getKpc(str,idx + 1);
        char ch = str.charAt(idx);
        
        String strForNum = keys[ch- '0'];
        
        for(int i=0;i<strForNum.length();i++) {
            
            for(String s: smallAns) {
                ans.add(strForNum.charAt(i) + s);
            }
        }
        
        return ans;
    }

}
