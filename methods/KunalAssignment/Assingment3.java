package KunalAssingments;
import java.util.Scanner;
public class Assingment3 {
    public static void main(String[] args) {
        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age);
    }
    static void vote(int age){
        if(age>=18){
            System.out.println("Eligible");
        }
        else System.out.println("Not Eligible");
    }
}
