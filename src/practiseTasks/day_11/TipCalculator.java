package practiseTasks.day_11;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        double tip=0.0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to our Restaurant");
        System.out.println("Split or No split");
        String split=sc.next();

        if(split.equalsIgnoreCase("yes")){

            System.out.println("Enter the number of people");
            int numberOfPeople=sc.nextInt();

            System.out.println("Enter the check amount (number) ");
            int checkAmount=sc.nextInt();

            System.out.println("Service Quality");
            String quality=sc.next();

            if(quality.equalsIgnoreCase("Poor")){
           tip= checkAmount*0.05;

            }
            else if (quality.equalsIgnoreCase("Fair")) {
                 tip=checkAmount*0.1;
            }
            else if (quality.equalsIgnoreCase("Good ")) {
                 tip=checkAmount*0.15;
            }
            else if (quality.equalsIgnoreCase("Great")) {
                tip=checkAmount*0.20;
            }
            else if (quality.equalsIgnoreCase("Excellent ")) {
                 tip=checkAmount*0.25;
            }


            System.out.println("Number of people entered "+numberOfPeople);
            System.out.println("Total to pay "+checkAmount);
            System.out.println("Total tip "+tip);
            System.out.println("Total per person "+checkAmount/numberOfPeople);
            System.out.println("Tip per person: "+tip/numberOfPeople);

        }
    }
}
