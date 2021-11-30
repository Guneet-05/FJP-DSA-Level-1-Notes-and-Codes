package Patterns.Codes;

import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.close();
        // write ur code here
        int n = scn.nextInt();

        int k = (n/2) + 1;

        for(int i=1;i<=k;i++) {

            for(int sp=1;sp<=k-i;sp++) {
                System.out.print("\t");
            }

            int c=i;
            for(int j=1;j<=2*i-1;j++) {
                
                if(j<=( (2*i)-1 )/2 + 1) {
                    System.out.print(c + "\t");
                    c++;
                } else {
                   if(j == ((2*i)-1)/2 + 2 ) c = c-2;

                   System.out.print(c + "\t");
                   c--;
                }
            }

            System.out.println();
        }
        int dec_counter = n-2;
        for(int i=1;i<=n/2;i++) {
            for(int sp=1;sp<=i;sp++) {
                System.out.print("\t");
            }

            int c = (n/2) - i +1;
            for(int j=1;j<=dec_counter;j++) {
                if(j<=(dec_counter)/2 + 1) {
                    System.out.print(c + "\t");
                    c++;
                } else {
                    if(j==dec_counter/2 + 2) c = c-2;

                    System.out.print(c + "\t");
                    c--;
                }
            }

            System.out.println();
            dec_counter -= 2;
        }
    }
}
