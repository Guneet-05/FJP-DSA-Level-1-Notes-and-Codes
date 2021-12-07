//This question is similar to the First Bad version problem
//Here also, we will minimize the number of API calls
//The intersting thing is that we will not hit the negative base case in this question ever i.e. we will
//always guess the number at the end 

package BinarySearch.Codes;

public class GuessGame {
    //We are given the higher number N and we know that the picked number is bw 1 to N
    //So, apply binary Search till we get the exact no we are looking for
}

// /** 
//  * Forward declaration of guess API.
//  * @param  num   your guess
//  * @return 	     -1 if num is lower than the guess number
//  *			      1 if num is higher than the guess number
//  *               otherwise return 0
//  * int guess(int num);
//  */

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//        long lo = 1;
//        long hi = n;
//        long mid;
        
//        while(lo <= hi) {
//           mid = (lo + hi) /2;
           
//           if(guess((int)mid) == 0) {
//               return (int)mid;
//           } else if(guess((int)mid) == -1) {
//               hi = mid-1;
//           } else {
//               lo = mid + 1;
//           }
//        } 
        
//        return -1; //This will never execute as we will always be able to guess a no.
//     }
// }
