package day_25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {
        DateTimeFormatter df= DateTimeFormatter.ofPattern("EEEE, MMMM/dd/yy");
        LocalDate today= LocalDate.now();
        System.out.println(today.format(df));
        LocalDate date1= LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));
        System.out.println("----------------------------------------\n");
        DateTimeFormatter tf= DateTimeFormatter.ofPattern("hh:mm:s a");
        LocalTime time1= LocalTime.of(23,39,15,152);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm:s a");
        LocalDateTime starts= LocalDateTime.now();
        System.out.println(starts.format(dtf));

    }
}
