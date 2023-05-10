package daily_lessons.day_38_exceptions;

public class Library {
public static void sleep(double seconds) {
    try {
        Thread.sleep((long) (seconds*1000));
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}

}
