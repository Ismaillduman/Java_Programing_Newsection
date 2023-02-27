package practiseTasks.day_09;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        /*Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score");
        char grade = sc.next().charAt(0);
        sc.close();
        String result = "Invalid Grade";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            switch (grade) {
                case 'A':
                    result = "the score of the student 90";
                    break;
                case 'B':
                    result = "the score of the student 80";
                    break;
                case 'C':
                    result = "the score of the student 70";
                    break;
                case 'D':
                    result = "the score of the student 60";
                    break;
                default:
                    result = "Failed 0<score<60";

            }
        }
else{
            System.out.println(result);
        }
        System.out.println("result = " + result);
    }
}
