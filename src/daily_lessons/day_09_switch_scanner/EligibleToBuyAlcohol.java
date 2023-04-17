package daily_lessons.day_09_switch_scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        /**
         *Eligible or not Eligible to buy alcohol
         *             2.1 Ask the user to enter his/her age
         *             2.2 write a program that can check if the person eligible to buy alcohol
         */
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        sc.close();

        System.out.println("Enter your age");

        if(age>16){
            System.out.println("You can eligible to buy Alcohol");
        }else {

        }
    }
}
