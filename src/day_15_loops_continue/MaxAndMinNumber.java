package day_15_loops_continue;

import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many number want to compare");
        int numCount=sc.nextInt();
        maxNum(numCount);
       // System.out.println("min number is: "+minNum(numCount));
    }

    public static int maxNum(int n) {
        Scanner sc = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter your number");
         int num=sc.nextInt();

            if(num>maxNum){
                maxNum=num;
            }
            if(num<minNum){
                minNum=num;
            }

        }
        System.out.println("maxNum: "+maxNum+" minNum: "+minNum);
        sc.close();
        return maxNum;

    }

    public static int minNum(int n) {
        Scanner sc = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter your number");
            int num=sc.nextInt();

            if(num<minNum){
                minNum=num;
            }

        }
        sc.close();
        return minNum;

    }

}
