//Got 8 marks

package Contest.FJP_Unofficial.Contest4;
import java.util.*;
public class GoodAndBad {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String str = sc.next();
            if(str.length() < 3) {
                System.out.println("Bad");
            } else {
                if(str.contains("101") || str.contains("010")){
                    System.out.println("Good");
                }
                else{
                    System.out.println("Bad");
                }
            }
        }
        sc.close();
    }    
}
