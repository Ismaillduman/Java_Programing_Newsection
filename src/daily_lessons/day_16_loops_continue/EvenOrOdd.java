package daily_lessons.day_16_loops_continue;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter a number");
          int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }

            System.out.println("Do you want to enter a new word yes/no");
            answer = sc.next().toLowerCase();

            while(!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Enter a valid answer");
                answer=sc.next().toLowerCase();
            }

        }
    }
}
