package daily_lessons.day_38_exceptions;

import daily_lessons.day_09_switch_scanner.ScannerIntro;
import reviews.week_13.Running;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args)  {
        System.out.println("Enter your age");
        int age= new Scanner(System.in).nextInt();

        if(age<0||age>150){
            if(age>150){
                throw new InputMismatchException("Age should not be greater than 150: "+age);
            }else{
                throw new InputMismatchException("Age should not be negative: "+age);
            }
        }
        if(age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
        System.out.println("---------------------------------------");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
        System.out.println("-----------------------------------------------");
        RuntimeException exception= new RuntimeException();

    }
}
