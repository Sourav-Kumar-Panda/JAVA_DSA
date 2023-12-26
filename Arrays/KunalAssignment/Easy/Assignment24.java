package KunalAssignment.Easy;

public class Assignment24 {
    public static void main(String[] args) {
        // [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
