package KunalAssingments;

import java.util.Scanner;

public class Assingment12 {
    public static void main(String[] args) {
        // Write a function to check if a given triplet is a Pythagorean triplet or not.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Is the given triplet is a Pythagorean:- "+isPythagorean(a,b,c));
    }
    static boolean isPythagorean(int a,int b,int c){
        return ((a*a)+(b*b) == (c*c));
    }
}
