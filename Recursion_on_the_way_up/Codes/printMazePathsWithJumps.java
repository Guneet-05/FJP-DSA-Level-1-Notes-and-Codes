package Recursion_on_the_way_up.Codes;
import java.util.*;

public class printMazePathsWithJumps {

    public static void main(String[] args) throws Exception { 
       
       Scanner scn = new Scanner(System.in);
       int rows = scn.nextInt();
       int cols = scn.nextInt();
       scn.close();
       printMazePaths(0,0,rows-1,cols-1,"");
       
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        
        int jump = 1;
        while(sc + jump <= dc) {
            printMazePaths(sr,sc+jump,dr,dc,psf + "h" + jump);
            jump++;
        }
        
        jump = 1;
        while(sr + jump <= dr) {
            printMazePaths(sr + jump,sc,dr,dc,psf + "v" + jump);
            jump++;
        }
        
        
        jump = 1;
        while(sr + jump <= dr && sc <= dc) {
            printMazePaths(sr + jump,sc + jump,dr,dc,psf + "d" + jump);
            jump++;
        }
        
    }

}