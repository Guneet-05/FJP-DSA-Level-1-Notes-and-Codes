package Getting_Started.Codes;
import java.util.*;
public class ReverseANumber {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        while(temp>0)
        {
            int ans=temp%10;
            temp=temp/10;
            System.out.println(ans);
        }
        scn.close();
    }
}
