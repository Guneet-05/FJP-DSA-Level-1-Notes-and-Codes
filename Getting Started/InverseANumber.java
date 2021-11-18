import java.util.*;
public class InverseANumber {
    
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1;
        int ans=0;
        int temp=n;
        while(temp>0)
        {
            int dig=temp%10;
            ans =ans + i*power(10,dig-1);
            temp=temp/10;
            i++;
        }
        System.out.println(ans);
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
        else{
            return n*power(n,p/2)*power(n,p/2);
        }
        
    }
}
