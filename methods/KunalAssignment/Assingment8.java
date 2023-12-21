package KunalAssingments;

import java.util.Scanner;

public class Assingment8 {
    public static void main(String[] args) {
    //     Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below
    //                                                 Marks        Grade
    //                                                 91-100         AA
    //                                                 81-90          AB
    //                                                 71-80          BB
    //                                                 61-70          BC
    //                                                 51-60          CD
    //                                                 41-50          DD
    //                                                 <=40          Fail


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = sc.nextInt();
        String ans = grade(mark);
        System.out.println(ans);
    }
    static String grade(int mark){
        switch(mark/10){
            case (10):
                return "AA";
            case (9):
                return "AA";
            case (8):
                return "AB";
            case (7):
                return "BB";
            case (6):
                return "BC";
            case (5):
                return "CD";
            case (4):
                return "DD";
            case (3):
                return "Fail";
            case (2):
                return "Fail";
            case (1):
                return "Fail";
            case (0):
                return "Fail";
        }
        return "fail";
    }
}
