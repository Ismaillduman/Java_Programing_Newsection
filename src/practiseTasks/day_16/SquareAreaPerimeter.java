package practiseTasks.day_16;

import java.util.Scanner;

public class SquareAreaPerimeter {
    public static void main(String[] args) {
/*Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers,
                                terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program*/
        Scanner sc = new Scanner(System.in);
        String answer="yes";
        while (answer.equalsIgnoreCase("yes")){
        System.out.println("Enter the side of the square:");
        double sideOfSquare=sc.nextDouble();
        if(sideOfSquare==0||sideOfSquare<0){
            System.err.println("Invalid Entry for the side of the square");
            System.exit(1);
        }
        else{

            double areaOfSquare=sideOfSquare*sideOfSquare;
            System.out.println("areaOfSquare = " + areaOfSquare);
            double perimeterOfSquare= 4*sideOfSquare;
            System.out.println("perimeterOfSquare = " + perimeterOfSquare);

            System.out.println("Would you like to calculate another Square?");
            answer=sc.next();
            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry try a valid entry");
                answer=sc.next();
            }

        }
    }}
}
