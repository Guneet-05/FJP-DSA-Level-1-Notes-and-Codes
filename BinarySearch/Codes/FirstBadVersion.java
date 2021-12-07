//This is a leetcode problem 
//It has been asked in Google many times
package BinarySearch.Codes;

public class FirstBadVersion {
    public static void main(String[] args) {
        //Again in this question we have to find the first occurence of the bad version
        //The minimum number of calls will be made if we apply the Binary Search Algorithm 
    }
}

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
        
//         int lo = 1;
//         int hi = n;
        
//         int ans = -1;
//         while(lo <= hi) {
//             int mid = lo + (hi-lo)/2;
            
//             if(isBadVersion(mid)) {
//                 ans  =  mid;
//                 hi = mid - 1;
//             } else {
//                 lo = mid + 1;
//             }
//         }
        
//         return ans;
//     }
// }
