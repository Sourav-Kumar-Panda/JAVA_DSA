package KunalAssignment.Easy;

import java.util.Arrays;

public class Assignment13 {
    // [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)

    // for flipping an image
    //step1: first we have to reverse it.like 1010-->0101
    //step2: Then we have to invert the reverse image.
    //  like 0-->1 , 1-->0


    // example
    // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    // Output: [[1,0,0],[0,1,0],[1,1,1]]
    // Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    // Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        //first we reverse the image.
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length/2;j++){
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length-1-j];
                image[i][image[i].length-1-j] = temp;
            }
        }
        //now we invert the reverse image
        //  like 0-->1 , 1-->0

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j] = 0;
                }
                else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
