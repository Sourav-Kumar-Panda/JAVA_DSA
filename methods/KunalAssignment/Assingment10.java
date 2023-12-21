package KunalAssingments;

public class Assingment10 {
    public static void main(String[] args) {
        // Write a function to find if a number is a palindrome or not. Take number as parameter.
        int num = 1012;
        if(palindrome(num)){
            System.out.println(num+" is a palindrome number");
        }
        else System.out.println(num+" is not a palindrome number");
    }
    static boolean palindrome(int num){
        int a = num;
        int temp = 0;
        while(a>0){
            int reminder = a % 10;
            temp = temp * 10 + reminder;
            a = a / 10;
        }
        return num == temp;
    }
}
