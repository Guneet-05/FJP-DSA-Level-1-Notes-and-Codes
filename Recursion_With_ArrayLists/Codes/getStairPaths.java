package Recursion_With_ArrayLists.Codes;

import java.util.*;
public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        scn.close();
        System.out.println(paths);
     }
 
     public static ArrayList<String> getStairPaths(int n) {
        
        if(n == 0) {
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        } 
        
        if(n < 0) {
            return new ArrayList<>();
        }
        
        ArrayList<String> smallAns1 = getStairPaths(n - 1);
        ArrayList<String> smallAns2 = getStairPaths(n - 2);
        ArrayList<String> smallAns3 = getStairPaths(n - 3);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(String s: smallAns1) {
            ans.add("1" + s);
        }
        
        for(String s: smallAns2) {
            ans.add("2" + s);
        }
        
        for(String s: smallAns3) {
            ans.add("3" + s);
        }
        
        return ans;
     }
}
