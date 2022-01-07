package Time_And_Space_Complexity.Searching_And_Sorting.Codes;

public class targetSumPairLeetcode {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target) {
        
        // //brute force
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=i+1;j<nums.length;j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[]{i=1,j+1};
        //         }
        //     }
        // }
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo < hi) {
            if(nums[lo] + nums[hi] < target) {
                lo++;
            } else if(nums[lo] + nums[hi] > target) {
                hi--;
            } else {
                return new int[]{lo+1,hi+1};
            }
        }
        
        return null;
    }
}
