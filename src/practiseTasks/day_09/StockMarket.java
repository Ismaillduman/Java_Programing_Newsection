package practiseTasks.day_09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        /* Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your
            company holdings"
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("how many total shares you have already");
        int shares = sc.nextInt();
        if (shares > 0) {
            System.out.println("how much your total value in the stock market is");
            double total_value = sc.nextDouble();
            System.out.println("enter the name of the company you have the most shares");
            sc.nextLine();
            String company_name=sc.nextLine();
            System.out.println("Your total stock market holding is $"+total_value+" which is made up of "+shares+" shares. " +
                    company_name +" is your company holdings.");

        } else {
            System.out.println("Invalid credentials");

        }
    }
}
