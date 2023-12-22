package KunalAssignment.Easy;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment9 {
    public static void main(String[] args) {
        // [Create Target Array in the Given Order]
        // (https://leetcode.com/problems/create-target-array-in-the-given-order/)

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            arr.add(index[i], nums[i]);
        }
        // int[] result = arr.stream().toArray();
        int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
