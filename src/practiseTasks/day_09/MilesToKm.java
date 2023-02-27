package practiseTasks.day_09;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        /*Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers*/

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your miles");
        double miles= sc.nextDouble();

        double km= miles*1.6;

        System.out.println(miles+ " miles ==>> "+ km+" km");
    }
}
