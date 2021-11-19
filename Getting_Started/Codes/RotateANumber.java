import java.util.*;
public class RotateANumber {
    
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int length=0;
        int temp=n;
        while(temp>0)
        {
            temp=temp/10;
            length++;
        }
        int k=scn.nextInt();
        if(k>=0)
        {
            k=k%length;
        }
        else
        {
           k=k%length;
           k=k+length;
        }
        int dig=n%power(10,k);
        n=n/power(10,k);
        n=n+(dig*power(10,length-k));
       System.out.println(n);
       scn.close();
    }
    public static int power(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }
        if(p%2==0)
        {
            return power(n,p/2)*power(n,p/2);
        }
        return n*power(n,p/2)*power(n,p/2);
    }
}
