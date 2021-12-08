package Recursion_With_ArrayLists.Codes;

import java.util.*;
public class GetMazePaths {
    public static void main(String[] args) throws Exception {
      
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        scn.close();
        System.out.println(getMazePaths(1,1,rows,cols));
     }
 
     // sr - source row
     // sc - source column
     // dr - destination row
     // dc - destination column
     public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
         
         if(sr > dr || sc > dc) {
             return new ArrayList<>();
         }
         
         if(sr == dr && sc == dc) {
             ArrayList<String> base = new ArrayList<>();
             base.add("");
             return base;
         }
         
         ArrayList<String> ans = new ArrayList<>();
         
         ArrayList<String> hPaths = getMazePaths(sr,sc+1,dr,dc);
         for(String hPath: hPaths) {
             ans.add("h" + hPath);
         }
         
         ArrayList<String> vPaths = getMazePaths(sr + 1,sc,dr,dc);
         for(String vPath: vPaths) {
             ans.add("v" + vPath);
         }
         
         return ans;
     }
}
