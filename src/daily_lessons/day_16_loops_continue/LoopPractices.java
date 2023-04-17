package daily_lessons.day_16_loops_continue;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("hello " + i);
        }
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < 5; i++) {

        }
        System.out.println("-------------------------------------------------------------------");
        int j = 0;
        while (j < 5) {
            System.out.println("Hi While" + j);
            j++;
        }
        System.out.println("----------------------------------------------------------");

        int k = 0;
        do {
            System.out.println("Hello doWhile" + k);
            k++;
        } while (k < 5);

        System.out.println("------------------------------------------------------------");
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your score");
        int score= sc.nextInt();

        while (score>100||score<0){
            System.err.println("Enter a valid Score");
            score=sc.nextInt();
        }
        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
