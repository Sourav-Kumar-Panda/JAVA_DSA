package KunalAssingments;

import java.util.Scanner;
public class Assingment6 {
    public static void main(String[] args){
        // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner sc = new Scanner(System.in);
        // circumference = 2*pi*r;
        // area  = pi*r*r;
        int radius = sc.nextInt();
        area(radius);
        circumference(radius);
    }
    static void area(int radius){
        System.out.println("Area = "+(22/7*radius*radius));
    }
    static void circumference(int radius){
        System.out.println("circumference = "+(2*22/7*radius));
    }
}
