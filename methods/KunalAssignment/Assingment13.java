package KunalAssingments;

import java.util.Scanner;

public class Assingment13 {
     public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers
        // a number is said to be prime if it only divisible by number 1 and it self;

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i = 2; i<=target;i++){
            if(isPrime(i)){
            System.out.print(i+" ");
            }
        }
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
