package day_14_method_overloading_loops;

import java.util.Scanner;

public class ForLoopPractise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number do you want ");
        int number = sc.nextInt();
        int sum = 0;
        int minNum =Integer.MAX_VALUE;

        for (int i = 1; i <= number; i++) {
            System.out.println("Enter number");
            int scNum=sc.nextInt();
            sum += scNum;
            minNum = scNum < minNum ? scNum : minNum;
        }
        System.out.println(sum);
        System.out.println(minNum);
    }
}
