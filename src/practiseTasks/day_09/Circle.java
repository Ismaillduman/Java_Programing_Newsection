package practiseTasks.day_09;

import java.util.Scanner;

public class Circle {
    /*Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double radius= sc.nextDouble();

        double area= Math.PI*radius*radius;
        double perimeter= 2*Math.PI*radius;

        sc.close();

        System.out.println("area is: "+ area + "Perimeter is: "+perimeter);
    }
}
