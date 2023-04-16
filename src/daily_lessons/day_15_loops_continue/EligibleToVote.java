package daily_lessons.day_15_loops_continue;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("enter your age");
        int age= sc.nextInt();

        while(!(age>=1&&age<=150)){
            System.err.println(" invalid age !! please enter again your age");
            age=sc.nextInt();
        }

        System.out.println("Are you us citizen or not yes/no");
        String answer= sc.next();

        while(!(answer.toLowerCase().equals("yes")||answer.toLowerCase().equals("no"))){
            System.err.println("invalid entry please enter Are you us citizen yes/no");
            answer=sc.next();
        }

        if(age>=21&&answer.equalsIgnoreCase("yes")){


                System.out.println("Eligible to Vote");

            }else{
                System.out.println("Not eligible to vote");
            }

        }


    }

