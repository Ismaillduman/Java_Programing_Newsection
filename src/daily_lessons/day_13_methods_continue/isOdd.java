package daily_lessons.day_13_methods_continue;

import java.util.Scanner;

public class isOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(isOdd(a));


        System.out.println(isEven(b));
    }

    /* Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false*/
    public static boolean isOdd(int a) {
        return (a%2!=0)? true:false;
    }
    public static boolean isEven(int a){
        return !isOdd(a);
    }
}
