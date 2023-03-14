package practiseTasks.day_15;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        /*Create a class named UntilNegative and
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.*/
        Scanner sc = new Scanner(System.in);
        int sum = 0;



        while (true) {
            System.out.println("Enter new numbers");
            int nums = sc.nextInt();
            if (nums < 0) {
                break;
            }
            sum += nums;


        }
        System.out.println("sum = " + sum);

//        while (true){
//            System.out.println("enter number");
//            int nums=sc.nextInt();
//
//            if(nums<0){
//                break;
//            }
//            sum+=nums;
//        }
//        System.out.println("sum = " + sum);
    }
}
