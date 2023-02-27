package practiseTasks.day_09;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"*/
  double result=0.0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first Number");
        int num_01= sc.nextInt();
        System.out.println("enter a math operator");
        char operator= sc.next().charAt(0);
        System.out.println("Enter second number");
        int num_2=sc.nextInt();
        switch(operator){
            case '+':
                result=num_01+num_2;
                break;
            case '-':
                result=num_01-num_2;
                break;
            case '*':
                result=num_01*num_2;
                break;
            case '/':
                result=num_01/num_2;
                break;
            default:
                System.out.println("invalid operator");
        }
        System.out.println("result = " + result);

    }
}
