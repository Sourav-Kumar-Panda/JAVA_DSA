package KunalAssignment.Easy;

import java.util.Arrays;

public class Assignment26 {
    public static void main(String[] args) {
        // [Plus One](https://leetcode.com/problems/plus-one/)
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}
