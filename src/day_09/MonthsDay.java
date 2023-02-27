package day_09;

import java.util.Scanner;

public class MonthsDay {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter youts favorite months number");
        int month= sc.nextInt();
        sc.close();
        String result = "invalid month";
        //if (month > 0 && month < 13) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = month + " that has 31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = month + " that has 30 days";
                break;
            default:
                result = month + " has 28 days";
        }

        System.out.println("result = " + result);
    }
}
