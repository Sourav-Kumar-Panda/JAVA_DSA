package KunalAssingments;
import java.util.Scanner;
import java.lang.Math;
public class Assingment1 {
    public static void main(String[] args) {
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

        //first of all we have to get the input of two number from the user;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //now we have to declare two functions to print the maximum value and the minimum value;
        maximum(num1,num2);
        minimum(num1,num2);
    }
    static void maximum(int a,int b){
        System.out.println("Maximum value is "+Math.max(a,b));
    }
    static void minimum(int a,int b){
        System.out.println("minimum value is "+Math.min(a,b));
    }
}
