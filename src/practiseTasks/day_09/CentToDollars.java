package practiseTasks.day_09;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        /*Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your cents amount");
        int cents = input.nextInt();
        input.close();
        int dollar = cents / 100;

        System.out.println(cents + " cents= " + dollar + " dollar " + cents % 100 + " cents");
input.close();

    }
}
