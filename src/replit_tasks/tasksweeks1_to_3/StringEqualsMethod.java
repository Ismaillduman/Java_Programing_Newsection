package replit_tasks.tasksweeks1_to_3;

import java.util.Scanner;

public class StringEqualsMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your version");
        String version = sc.nextLine();


         //if(userinput.equals("admin")) { // etc}
        //The equals() method compares two strings, and returns true if the strings are equal, and false if not.
        //== checks to see if the actual object references are the same.
        //equals(...) checks if the two Strings hold the same string (ie the same characters in the same order)

        if (version.equals("1.5")) System.out.println("Cupcake");
        else if (version.equals("1.6")) System.out.println("Donut");
        else if (version.equals("2.1")) System.out.println("Eclair");

        else System.out.print("Not a valid version");
    }

}
