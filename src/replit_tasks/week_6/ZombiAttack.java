package replit_tasks.week_6;

import java.util.Scanner;

public class ZombiAttack {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:

        int count=0;
        while(inhabitants>=1){



            System.out.println("Day "+count+" ["+inhabitants+"]");
            inhabitants=inhabitants/2;
            count++;
        }

        System.out.println("---- EXTINCT ----");
    }
}
