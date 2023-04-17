package daily_lessons.day_25;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
        LocalDateTime starts= LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends= LocalDateTime.of(2012,5,18,11,0);
        System.out.println(ends);

        System.out.println(starts.getDayOfMonth());
        System.out.println(starts.getDayOfWeek());


    }
}
