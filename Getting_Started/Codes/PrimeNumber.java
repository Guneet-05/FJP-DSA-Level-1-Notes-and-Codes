import java.util.*;

public class PrimeNumber {

    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        int i=2;
        // for(i=2;i<n;i++)
        // {
        //     if(n%i==0)
        //     {
        //         System.out.println("not prime");
        //         break;
        //     }
        // }
        // if(i==n)
        // {
        //     System.out.println("prime");
        // }
        while(i*i<=n)
        {
            if(n%i==0)
            {
                System.out.println("not prrime");
                break;
            }
        }
        if(i*i>n)
        {
            System.out.println("prime");
        }
    }
    
}
