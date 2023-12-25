package KunalAssignment.Easy;
public class Assignment16 {
    public static void main(String[] args) {
        // [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }static  int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(check(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean check(int num){
        int count = 0;
        while(num > 0){
            num = num /10;
            count++;
        }
        return count % 2 == 0;
    }
}

