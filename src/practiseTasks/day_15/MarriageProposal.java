package practiseTasks.day_15;

import java.util.Scanner;

public class MarriageProposal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Will you marry with me");
        String yesOrNo=sc.nextLine();

        while(!(yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("no"))){
            System.out.println("Enter Please valid answer");
            yesOrNo=sc.nextLine();
        }
        sc.close();

        if(yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
