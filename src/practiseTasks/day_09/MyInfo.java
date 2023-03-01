package practiseTasks.day_09;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        /*Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);
        System.out.println(" Enter your full name");
        sc.nextLine();
        String full_name = sc.nextLine();
        System.out.println("Enter your phone number");
        long phone_number = sc.nextLong();
        System.out.println(" Enter your zip code");
        int zipCode = sc.nextInt();
        System.out.println("Enter your School name ");
        sc.nextLine();
        String schoolName = sc.nextLine();
        System.out.println("Enter your city name ");

        String city_name = sc.nextLine();
        System.out.println("Enter your state name");
        String state_name = sc.next();
        System.out.println("Enter your building number");
        int building_number = sc.nextInt();
        System.out.println("Enter your Street name");
        sc.nextLine();
        String streetName = sc.nextLine();
/* 1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name*/
        System.out.println("1.Full Name: " + full_name + "\n2.Age: " + age + "\n3.gender: " + gender + "\n4.phone number: " + phone_number +
                "\n5.address: \n\t\t Buildings Number: " + building_number + " Street:" + streetName + "\n\t\t City: " + city_name +
                " State: " + state_name + " Zipcode: " + zipCode);
sc.close();
    }
}
