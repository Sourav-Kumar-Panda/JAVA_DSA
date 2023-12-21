package KunalAssignment.Easy;

import java.util.Arrays;

public class Assignment5 {
    public static void main(String[] args) {
        // [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans  = new int[nums.length];
        int count = 0;
        for(int i=0;i<n;i++){
            ans[count] = nums[i];
            count++;
            ans[count] = nums[n+i];
            count++;
        }
        return ans;
    }
}
