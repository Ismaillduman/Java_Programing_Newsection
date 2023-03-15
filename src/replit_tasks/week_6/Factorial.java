package replit_tasks.week_6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int result=1;
        for (int i = n; i >0; i--) {
            result*=i;
        }
        System.out.println(result);

    }
}
