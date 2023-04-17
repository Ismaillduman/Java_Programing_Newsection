package daily_lessons.day_09_switch_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your first number");
        byte number_1= input.nextByte();
        System.out.println("enter your second number");
        short number_2= input.nextShort();
        System.out.println("enter your third number");
        int number_3= input.nextInt();
        input.close();

        System.out.println("number_1: " + number_1+ " number_2: "+number_2+" number_3: "+number_3);
    }
}
