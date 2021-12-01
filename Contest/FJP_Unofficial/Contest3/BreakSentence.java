//This question is also available on leetcode by the name of truncate sentence

package Contest.FJP_Unofficial.Contest3;

import java.util.*;

public class BreakSentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int k = scn.nextInt();

        scn.close();
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        
        String ans = "";
        int count = 0;
        
        int idx = 0;
        while(idx < s.length()) {
            
            while(idx< s.length() && s.charAt(idx) != ' ') {
                ans += s.charAt(idx);
                idx++;
            }
            count++;
            if(count < k) {
                ans += ' ';
                idx++;
            }
            
            if(count == k) break;
        }
        
        return ans;
    }
}