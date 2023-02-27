package practiseTasks.outOfConcept;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeeks {
    public static void main(String[] args)
    {
        // Set a local date whose day is found
        LocalDate localDate
                = LocalDate.of(2015,
                Month.JULY, 13);

        // Find the day from the local date
        DayOfWeek dayOfWeek
                = DayOfWeek.from(localDate);

        // Printing the day of the week
        // and its Int value
        System.out.println("Day of the Week on"
                + " 13th July 2015 - "
                + dayOfWeek.name());

        int val = dayOfWeek.getValue();

        System.out.println("Int Value of "
                + dayOfWeek.name()
                + " - " + val);
    }
}

