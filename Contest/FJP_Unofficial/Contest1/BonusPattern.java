package Contest.FJP_Unofficial.Contest1;

import java.util.*;
public class BonusPattern {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         
        int dec_counter = 2*n;
        int tn = 0;
        int d = dec_counter;
    
        while(d >= 2) {
            tn += d;
            d -= 2;
        }
        int x = 1;
        int y = tn;
        int inc_counter = 0;
        int var = 0;
        
        for(int i=1;i<=n;i++) {
           
            for(int sp=1;sp<=inc_counter;sp++) {
                System.out.print("-");
            }
            
          
            
            for(int j=1;j<=dec_counter/2;j++) {
                System.out.print(x + "*");
                 x++;
            }
            
            y = y - dec_counter/2 + 1;
            
            for(int j=dec_counter/2 +1;j<=dec_counter;j++) {
                
                if(j==dec_counter/2 + 1) {
                    var = y;
                }
                
                if(j == dec_counter) {
                    System.out.print(y);
                } else {
                    System.out.print(y + "*");
                }
                y++;
            }
            y = var-1;
            
            dec_counter -= 2;
            inc_counter += 2;
            System.out.println();
        }
        scn.close();
    }
}
