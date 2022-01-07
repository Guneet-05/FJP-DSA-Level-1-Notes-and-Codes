package Contest.FJP_Official.Contest7;

import java.util.*;

public class MultiMoveInMazePath {

    static int psf = 0;
    public static void countPaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc) {
            return;
        }
        
        if(sr == dr && sc == dc) {
            psf++;
            return;
        }
        
        
        for(int hms=1; hms<=dc;hms++) {
            countPaths(sr,sc+hms,dr, dc);
        }
        
        for(int vms=1;vms<=dr;vms++) {
            countPaths(sr + vms,sc, dr, dc);
        }
        
        if(sr + sc == dc || sr == sc  || sr==0 || sc==0 ) {
            for(int dms=1; dms<=dc && dms<=dr; dms++) {
                countPaths(sr + dms, sc + dms, dr ,dc);
            }
        }
    }
    
    public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {
        
        if(sr > dr || sc > dc ) {
            return new ArrayList<>();
        }
        
        if(sr == dr && sc == dc) {
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }
        
        //horizontal paths
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(int hms=1;hms<=dc;hms++) {
            ArrayList<String> hPaths = getPaths(sr,sc + hms,dr,dc);
            
            for(String hPath: hPaths) {
                ans.add("H" + hms + hPath);
            }
        }
        
        for(int vms=1;vms<=dr;vms++) {
            ArrayList<String> vPaths = getPaths(sr + vms, sc, dr ,dc);
            
            for(String vPath:vPaths) {
                ans.add("V" + vms + vPath);
            }
        }
        
        for(int dms=1;dms<=dr && dms<=dc; dms++) {
            if(sr==sc || sr + sc== dc ||sr==0 ||sc == 0) {
                ArrayList<String> dPaths = getPaths(sr + dms, sc + dms, dr, dc);
                
                for(String dPath: dPaths) {
                    ans.add("D" + dms + dPath);
                }
            }
        }
        
        return ans;
    }
    
    public static void printPaths(int sr, int sc, int dr, int dc,String psf) {
        
        
        if(sr > dr || sc > dc) {
            return;
        }
        
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        
        
        for(int hms=1; hms<=dc;hms++) {
            printPaths(sr,sc+hms,dr, dc, psf + "H" + hms);
        }
        
        for(int vms=1;vms<=dr;vms++) {
            printPaths(sr + vms,sc, dr, dc, psf + "V" + vms);
        }
        
        if(sr + sc == dc || sr == sc  || sr==0 || sc==0){
            for(int dms=1; dms<=dc && dms<=dr; dms++) {
                printPaths(sr + dms, sc + dms, dr ,dc , psf + "D" + dms);
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        countPaths(0,0,n-1,m-1);
        System.out.println(psf);
        ArrayList<String> paths = getPaths(0,0,n-1,m-1);
        System.out.println(paths);
        printPaths(0,0,n-1,m-1,"");
        scn.close();
    }
}