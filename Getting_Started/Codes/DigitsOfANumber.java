import java.util.*;
public class DigitsOfANumber {
    
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int temp=n;
        int c=0;
        while(temp>0)
        {
            temp=temp/10;
            c++;
        }
        int p=c-1;
        while(p>=0)
        {
            int div=power(10,p);
            int ans=n/div;
            System.out.println(ans);
            n=n%div;
            p--;
        }
        scn.close();
    }
    public static int power(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }

        return n*power(n,p-1);
    }
}
