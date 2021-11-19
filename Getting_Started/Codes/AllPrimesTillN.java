import java.util.*;

public class AllPrimesTillN
{
   public static void main(String[] args)
   {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       for(int i=2;i<=n;i++)
       {
           if(isPrime(i))
           {
               System.out.println(i);
           }
       }
       scn.close();
   }

   public static boolean isPrime(int n)
   {
       int i=2;
       while(i*i<=n)
       {
           if(n%i==0)
           {
               return false;
           }
           i++;
       }
       return true;
   }
}