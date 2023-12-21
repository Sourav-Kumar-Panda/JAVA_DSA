package KunalAssingments;

public class Assingment9 {
    public static void main(String[] args) {
        // Write a program to print the factorial of a number by defining a method named 'Factorial'
        int number = 1;
        if(number == 0){
            System.out.println(1);
        }
        else{
            fact(number);
        }
    }
    static void fact(int num){
        double total = num;
        for(double i=num-1; i>0; i--){
            total = total * i;
        }
        System.out.println(total);
    }
}
