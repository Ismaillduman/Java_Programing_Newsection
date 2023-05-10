package daily_lessons.day_38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
method1();
method2();
    }
    public static void pauseForTwoSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseForTwoSeconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");
        Thread.sleep(3000);
        System.out.println("First program ended");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }
}
