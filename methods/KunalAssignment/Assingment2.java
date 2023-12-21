package KunalAssignment;
import java.util.Scanner;
public class Assingment2 {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd.

        // first of all we have the get input from the user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // now we have to declare a function to print whether a number is even or odd.
        //This function is going to be void type , bcz we dont have to return anything, we have to just print the result.
        check(num);
    }
    static void check(int num){
        if(num%2==0){
            System.out.println("Even number");
        }
        else System.out.println("Odd number");
    }
}
