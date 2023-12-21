package KunalAssignment.Easy;

import java.util.Arrays;

public class Assignment2 {
    public static void main(String[] args) {
        // [Concatenation of Array]     (https://leetcode.com/problems/concatenation-of-array/)
        // Input: nums = [1,2,1]
        // Output: [1,2,1,1,2,1]


        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }

}
