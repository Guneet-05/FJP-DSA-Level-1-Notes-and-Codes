package Functions_and_Arrays.Codes;

import java.util.*;

public class AnyBaseMul{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    scn.close();
    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int add(int n1, int n2, int b) {

     int ans=0, multiplier = 1;
     int ca = 0;

     while(n1 > 0 || n2 > 0 || ca > 0) {
         int d1 = n1%10;
         int d2 = n2%10;

         int temp  = d1 + d2 + ca;
         int digit = 0;
         
         if(temp >= b) {
             digit = temp%b;
             ca = temp/b;
         } else {
             digit = temp;
             ca = 0;
         }

         ans += digit*multiplier;
         multiplier *= 10;
         n1 /= 10;
         n2 /= 10;
     }

     return ans;
 }

 public static int multiplyWithDigit(int n, int d, int b) {

     int ans = 0;
     int multiplier = 1;
     int carry = 0;

     while(n > 0 || carry > 0) {
         int d1 = n%10;
 
         int temp = d1*d + carry;
         int digit = 0;
         
         if(temp >= b) {
            digit = temp%b;
            carry = temp/b;
         } else {
            digit = temp;
            carry = 0;
         }

         ans += digit*multiplier;
         multiplier *= 10;
         n = n/10;
     }

     return ans;
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here

     int ans = 0;
     int multiplier = 1;

     while(n1 > 0) {

         int d1 = n1%10;
         n1 = n1/10;

         int smallAns = multiplyWithDigit(n2,d1,b);
         ans = add(ans,smallAns*multiplier,b);
         multiplier *= 10; 
     }

     return ans;
 }

}