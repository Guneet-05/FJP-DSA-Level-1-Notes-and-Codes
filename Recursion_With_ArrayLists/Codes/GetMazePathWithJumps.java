package Recursion_With_ArrayLists.Codes;

import java.util.*;

public class GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
      
      Scanner scn = new Scanner(System.in);
      int rows = scn.nextInt();
      int cols = scn.nextInt();
      scn.close();
      System.out.println(getMazePaths(0,0,rows-1,cols-1));
   
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        int jump = 1;
        while(sc + jump <= dc) {
            ArrayList<String> hPaths = getMazePaths(sr,sc+jump,dr,dc);
            for(String hPath: hPaths) {
                ans.add("h" + jump + hPath);
            }
            jump++;
        }
        
        jump = 1;
        while(sr + jump <= dr) {
            ArrayList<String> vPaths = getMazePaths(sr+jump,sc,dr,dc);
            for(String vPath: vPaths) {
                ans.add("v" + jump + vPath);
            }
            
            jump++;
        }
        
        jump = 1;
        while(sc + jump <= dc && sr + jump <= dr) {
            ArrayList<String> dPaths = getMazePaths(sr+jump,sc+jump,dr,dc);
            for(String dPath: dPaths) {
                ans.add("d" + jump + dPath);
            }
            jump++;
        }
        
        return ans;
    }

}