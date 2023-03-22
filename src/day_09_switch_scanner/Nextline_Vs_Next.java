package day_09_switch_scanner;

import java.util.Scanner;

public class Nextline_Vs_Next {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        //Scanner scn = new Scanner(System.in);
        System.out.println("enter your full name");
        String full_name = sc.nextLine(); //nextLine catch the enter. make that only nextLine. fullName + enter

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);

        sc.close();
        // we can use nextLine method after a nextLine methode without an issue. But after any other next methode
        //we have to provide an extra nextLine methode
    }
}
