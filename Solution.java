import java.util.*;
public class Solution {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0) {
            char first = scn.next().charAt(0);
            char second = scn.next().charAt(1);
            char third = scn.next().charAt(2);

            System.out.println(first);   
            System.out.println(second);
            System.out.println(third);
        }
        scn.close();
    }
}
