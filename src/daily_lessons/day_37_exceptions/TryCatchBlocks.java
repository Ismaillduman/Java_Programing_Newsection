package daily_lessons.day_37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("program started");
        try {
            System.out.println(9 / 0);
            System.out.println("Try block");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        }

        System.out.println("Program ended");
        System.out.println("========================================================");

        System.out.println("Program2 started");
        String str = null;

        try {

            str.substring(1);
            System.out.println("Try block");
        } catch (NullPointerException e) {
            System.out.println("Catch block");
        }

        System.out.println("Program2 ended");
        System.out.println("____________________________________________");
        System.out.println("Program3 started");
        try {
            Thread.sleep(3000);
            System.out.println("Try Block");
        }catch (InterruptedException e){
            System.out.println( "Catch Blocked");
        }

        System.out.println("Program3 ended");


    }
}
