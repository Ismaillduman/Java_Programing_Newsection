package daily_lessons.day_24_arrayList_continue;

import java.time.LocalTime;
import java.time.ZonedDateTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime starting_time = LocalTime.of(10, 30);
        System.out.println(starting_time);

        ZonedDateTime right_now = ZonedDateTime.now();
        System.out.println(right_now);
        System.out.println("----------------------------------------");
        LocalTime time1 = LocalTime.of(23, 59, 59, 125);
        System.out.println(time1);
        time1 = time1.plusHours(1);
        System.out.println(time1);
        time1 = time1.minusHours(2);
        System.out.println(time1);
        time1=time1.plusMinutes(45);
        System.out.println(time1);

    }
}