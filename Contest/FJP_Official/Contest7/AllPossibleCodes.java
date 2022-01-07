package Contest.FJP_Official.Contest7;

import java.util.*;

public class AllPossibleCodes {

    public static void Encodings(int idx,String input,String output) {
        if(idx == input.length()) {
            //positve base case
            System.out.println(output);
            return;
        }
        
        int ch1 = input.charAt(idx) - '0';
        if(ch1 >=1 && ch1<=9) {
            Encodings(idx + 1,input, output + (char)('a' + ch1 - 1));
        }
        
        if(idx + 1 < input.length()) {
            int ch2 = (input.charAt(idx) - '0') * 10 + (input.charAt(idx+1) - '0');
            
            if(ch2 >= 10 && ch2<= 26) {
                Encodings(idx + 2,input,output + (char)('a' + ch2 -1));
            }
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        String input = scn.next();
        scn.close();
        Encodings(0,input,"");
    }
}