package Recursion_on_the_way_up.Codes;
import java.util.*;

	public class printMazePaths {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int rows = scn.nextInt();
            int cols = scn.nextInt();
            scn.close();
            
            MazePaths(0,0,rows-1,cols-1,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void MazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        //negative base call will never be made according to this code
	        
	        if(sr == dr && sc == dc) {
	            System.out.println(psf);
	            return;
	        }
	        
	        
	        if(sc + 1 <= dc) {
	           MazePaths(sr,sc + 1,dr,dc,psf + "h"); 
	        }
	        
	        if(sr + 1 <= dr) {
	           MazePaths(sr + 1,sc,dr,dc,psf + "v");
	        }
	    }

	}