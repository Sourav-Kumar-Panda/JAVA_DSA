package KunalAssignment.Easy;

public class Assignment12 {
    public static void main(String[] args) {
        // [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)

        // Input: gain = [-5,1,5,0,-7]
        // Output: 1
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int highest = 0;
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum>highest){
                highest = sum;
            }
        }
        return highest;
    }
}
