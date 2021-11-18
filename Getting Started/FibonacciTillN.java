import java.util.*;
public class FibonacciTillN {
    
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int c;
        if(n==1)
        {
            System.out.println(a);
        }
        else if(n==2)
        {
            System.out.println(a);
            System.out.println(b);            
        }
        else
        {
            System.out.println(a);
            System.out.println(b);
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }

        }
        scn.close();
    }
}
