import java.util.*;
public class CountDigits {
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
        System.out.println(c);
        scn.close();
    }
}
