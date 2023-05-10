package daily_lessons.day_38_exceptions;

public class Library {
public static void sleep(double seconds) throws InterruptedException {
    Thread.sleep((long) (seconds*1000));
}

}
