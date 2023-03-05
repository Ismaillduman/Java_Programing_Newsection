package replit_tasks.tasks_week_4;

import java.util.Locale;
import java.util.Scanner;

public class carInsurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Cydeo car insurance!");


        double premiumCost = 0.0;
        System.out.println("Enter your full name");

        String name = sc.nextLine();
        System.out.println("Do you have a US driver license?");
        String license = sc.next();
        if (license.equals("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        } else {
            System.out.println("Enter your zip code");
            int zipCode = sc.nextInt();
            if (zipCode == 20910 || zipCode == 20740) {
                premiumCost += 60;
            } else if (zipCode == 22102 || zipCode == 22103) {
                premiumCost += 30;
            } else {
                premiumCost += 50;
            }
            System.out.println("Is this vehicle owned, financed, or leased?");
            String ownership = sc.next();
            if (ownership.equalsIgnoreCase("owned")) {
                premiumCost += 10;
            } else if (ownership.equalsIgnoreCase("financed")) {
                premiumCost += 15;
            } else {
                premiumCost += 20;
            }
            System.out.println("How is this vehicle primarily used?");
            String carUsage = sc.next();
            if (carUsage.equalsIgnoreCase("business")) {
                premiumCost += 50;
            } else if (carUsage.equalsIgnoreCase("pleasure")) {
                premiumCost += 10;
            } else if (carUsage.equalsIgnoreCase("commuting")) {
                System.out.println("How many days do you commute?");
                int commuteDays = sc.nextInt();
                premiumCost += 20 + (commuteDays * 5);
            }
            System.out.println("How old are you?");
            int age = sc.nextInt();
            if (age < 16) {
                System.out.println("You can't be driving");
                System.exit(0);
            } else if (age > 16 && age < 20) {
                premiumCost *= 10;
            } else if (age >= 20 && age < 25) {
                premiumCost *= 6;
            } else if (age >= 25) {
                premiumCost *= 2;
            }
            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents = sc.next();
            if (accidents.equalsIgnoreCase("yes")) {
                System.out.println("How many?");
                int accidentNumber = sc.nextInt();
                premiumCost += accidentNumber * 10;

            }
            System.out.println("What is the highest level of education you have completed?");
            sc.nextLine();
            String educationLevel = sc.nextLine();
            switch (educationLevel) {
                case "Bachelors":
                case "Masters":
                    premiumCost -= premiumCost * 0.05;
                    break;
                case "PHD":
                    premiumCost -= premiumCost * 0.1;
                    break;
                case "High School":
                    premiumCost -= premiumCost * 0.05;
                    break;
            }

            String firstName = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" "));
            String lastName = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() + name.substring(name.indexOf(" ") + 2);
            name = firstName + " " + lastName;
            String referenceNumber = firstName.substring(0, 2).toUpperCase() + age + lastName.substring(lastName.length() - 3).toUpperCase()
                    + zipCode + educationLevel.replaceAll(" ", "").toUpperCase();
            System.out.println(name + ", here's your quote!\n" + "This is your start premium cost: $" + premiumCost +
                    "\nThis is your reference number: " + referenceNumber);

        }
    }
}
