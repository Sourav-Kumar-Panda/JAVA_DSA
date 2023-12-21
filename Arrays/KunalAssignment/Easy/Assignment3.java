package KunalAssignment.Easy;

import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {
        // [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(nums) ));

    }
    static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}
