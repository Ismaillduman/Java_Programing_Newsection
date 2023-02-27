package practiseTasks.day_09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {
        /*Create a class named PlaceAnOrder:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.*/

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the product name");
        String product_name= sc.nextLine();
        System.out.println("Enter the price");
        double price= sc.nextDouble();
        System.out.println("enter the quantity");
        int quantity= sc.nextInt();
        sc.nextLine(); // to take enter
        System.out.println("Enter the first name");
        String first_name=sc.nextLine();

        System.out.println(first_name+ " your order for "+quantity+" "+product_name+
                " has been places. Your total is "+price+".");

        sc.close();

    }
}
