package KunalAssingments;
import java.util.Scanner;
public class Assingment7 {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not
        // a number is said to be prime if it only divisible by number 1 and it self;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }
        else System.out.println(num+" is not a prime number");
    }
    static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
