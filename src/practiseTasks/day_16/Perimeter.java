package practiseTasks.day_16;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        perimeter();
    }

    /*Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message
                                 "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
*/
    public static void perimeter() {
        Scanner sc = new Scanner(System.in);
        String answer="yes";
        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter the radius of the circle:");
            double radius = sc.nextDouble();
            if (radius == 0 || radius < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            } else {

                double perimeter = 2 * Math.PI * radius;
                System.out.println("perimeter = " + perimeter);
                double area = Math.PI * radius * radius;
                System.out.println("area = " + area);
                double diameter = 2 * radius;
                System.out.println("diameter = " + diameter);

            }
            System.out.println("Would you like to calculate another circle? yes/no");
            answer=sc.next();
            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("re-enter valid entry");
                answer=sc.next();
            }

        }
    }
}
