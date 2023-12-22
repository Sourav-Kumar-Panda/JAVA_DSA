package KunalAssignment.Easy;

public class Assignment7 {
    public static void main(String[] args) {
        // [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)

        // Given an array of integers nums, return the number of good pairs.
        // A pair (i, j) is called good if nums[i] == nums[j] and i < j.


        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
