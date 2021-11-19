import java.util.*;
public class PrimeFactorisation {
    
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=2;
        while(n!=1)
        {
            while(n%i==0)
            {
                n=n/i;
                System.out.print(i+" ");
            }
            i++;
        }
        scn.close();
    }
}
