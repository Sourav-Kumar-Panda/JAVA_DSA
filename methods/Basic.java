import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sum(a,b);
        int d = sum(a,b,12);
        System.out.println(c);
        System.out.println(d);
    }
    static int sum(int a, int b){
        return (int)a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
}