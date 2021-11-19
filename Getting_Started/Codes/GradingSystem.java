package Getting_Started.Codes;
import java.util.*;

public class GradingSystem {

    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        if(n>90)
        {
            System.out.println("excellent");
        }
        else if(n<=90 && n>80)
        {
             System.out.println(n);
        }
        else if(n>70 && n<=80)
        {
            System.out.println("fair");
        }
        else if(n>60 && n<=70)
        {
            System.out.println("meets expectations");
        }
        else
        {
            System.out.println("below par");
        }
    }
    
}
