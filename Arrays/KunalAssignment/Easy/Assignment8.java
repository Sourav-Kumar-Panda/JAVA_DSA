package KunalAssignment.Easy;

import java.util.Arrays;

public class Assignment8 {
    public static void main(String[] args) {
        // [How Many Numbers Are Smaller Than the Current Number]
        // (https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)


        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}
