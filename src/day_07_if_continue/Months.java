package day_07_if_continue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();
        String result = "";
        if (monthNum > 0 && monthNum <= 12) {

            if (monthNum == 1) {

                result = "January";
            } else if (monthNum == 2) {
                result = "Februar";
            } else if (monthNum == 3) {
                result = "March";
            } else if (monthNum == 4) {
                result = "April";
            } else if (monthNum == 5) {
                result = "May";
            } else if (monthNum == 6) {
                result = "June";
            } else if (monthNum == 7) {
                result = "July";
            } else if (monthNum == 8) {
                result = "August";
            } else if (monthNum == 9) {
                result = "September";
            } else if (monthNum == 10) {
                result = "October";
            } else if (monthNum == 11) {
                result = "November";
            } else if (monthNum == 12) {
                result = "December";
            }
        } else {
            result = "Invalid month number";
        }
        System.out.println(result);
    }
}
