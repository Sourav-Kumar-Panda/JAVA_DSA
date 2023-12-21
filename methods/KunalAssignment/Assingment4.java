package KunalAssingments;

import java.util.Scanner;

public class Assingment4 {
    public static void main(String[] args){
        // Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.println(c);
    }
    static int sum(int a, int b){
        return a+b;
    }
}
