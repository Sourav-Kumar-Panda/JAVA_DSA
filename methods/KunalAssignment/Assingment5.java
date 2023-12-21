package KunalAssingments;

import java.util.Scanner;

public class Assingment5 {
    public static void main(String[] args) {
        // Define a method that returns the product of two numbers entered by user.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = prod(a,b);
        System.out.println(c);
    }
    static int prod(int a, int b){
        return a*b;
    }
}
