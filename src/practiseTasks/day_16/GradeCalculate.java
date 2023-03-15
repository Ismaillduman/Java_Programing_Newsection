package practiseTasks.day_16;

import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {
        /* Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message
                                "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message
                                "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program*/
        Scanner sc = new Scanner(System.in);
        String answer= "yes";
        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter your Score");
            int score = sc.nextInt();
            if (score > 100 || score < 0) {
                System.err.println("Invalid Entry");
                System.exit(1);
            } else {
                char grade = 'A';
                grade = score >= 0 && score < 60 ? 'F' : score > 59 && score < 70 ? 'D' : score > 69 && score < 80 ? 'C' : score > 79 && score < 90 ? 'B' : 'A';
                System.out.println("grade = " + grade);

                System.out.println(" would you like to continue");
                answer = sc.next();
                while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                    System.out.println("Invalid Entry");
                    System.exit(1);
                }
            }
        }
    }
}
