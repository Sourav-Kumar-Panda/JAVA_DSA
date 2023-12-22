package KunalAssignment.Easy;

import java.util.ArrayList;
import java.util.List;

public class Assignment6 {
    public static void main(String[] args) {
        // [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    } static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = max_candies(candies);
        for(int i=0;i<candies.length;i++){
           result.add((candies[i]+extraCandies)>=max);
        }
        return result;
    }
    static int max_candies(int[] arr){
        int max = arr[0];
        for(int num:arr){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}