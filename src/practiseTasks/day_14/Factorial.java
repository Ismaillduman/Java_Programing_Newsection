package practiseTasks.day_14;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int factorialNum= sc.nextInt();
        System.out.println("factorial(factorialNum) = " + factorial(factorialNum));
    }
    public static int factorial(int n) {
        int factorialNum = 1;
        for (int i = n; i > 0; i--) {

            factorialNum *= i;
        }
        return factorialNum;
    }
}
