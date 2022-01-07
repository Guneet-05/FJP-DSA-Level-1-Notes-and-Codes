package Contest.FJP_Official.Contest7;

import java.util.*;

public class CountOfaaa {
    
    public static void overLap(String str, int csf) {
        
        if(str.length() < 3 || str.equals("")) {
            System.out.println(csf);
            return;
        }
        
        String subStr = str.substring(0,3);
        if(subStr.equals("aaa") == true) {
            csf++;
        }
        
        String ros = str.substring(1);
        overLap(ros,csf);
    }
    
    public static void nonOverLap(String str, int csf) {
        
        if(str.length() < 3 || str.equals("")) {
            System.out.println(csf);
            return;
        }
        
        String subStr = str.substring(0,3);
        if(subStr.equals("aaa")) {
            String ros = str.substring(3);
            nonOverLap(ros,csf + 1);
        } else {
            String ros = str.substring(1);
            nonOverLap(ros,csf);
        }
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        overLap(str,0);
        nonOverLap(str,0);
        scn.close();
    }
}