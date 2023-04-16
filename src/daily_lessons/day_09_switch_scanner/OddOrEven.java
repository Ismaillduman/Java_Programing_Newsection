package daily_lessons.day_09_switch_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yours number");
        String result="";
        int number = scanner.nextInt();
        scanner.close();
        boolean even= number%2==0;
        if(even){
            result="That's even number";
        }else {
            result="That's odd number";
        }
        System.out.println(result);
    }
}
