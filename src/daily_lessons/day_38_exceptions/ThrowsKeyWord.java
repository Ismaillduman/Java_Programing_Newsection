package daily_lessons.day_38_exceptions;

public class ThrowsKeyWord {
    public static void main(String[] args) throws InterruptedException {
        Library.sleep(3.5);
        System.out.println("Program1 Started");
        Thread.sleep(3000);
        System.out.println("Program1 ended");
        System.out.println("-------------------------------------------------------");
        System.out.println("Program2 Started");
        Thread.sleep(3000);
        System.out.println("Program2 ended");
        System.out.println("-------------------------------------------------------");
        System.out.println("Program3 Started");
        Thread.sleep(3000);
        System.out.println("Program3 ended");
        System.out.println("-------------------------------------------------------");


    }
}
