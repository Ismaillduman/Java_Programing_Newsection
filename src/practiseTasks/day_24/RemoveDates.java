package practiseTasks.day_24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {
    public static void main(String[] args) {
/* create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016*/
        ArrayList<LocalDate> dates= new ArrayList<>();
        dates.addAll(Arrays.asList(LocalDate.of(2015,2,2),LocalDate.of(2016,5,5),LocalDate.of(2014,5,6)));
        dates.removeIf(p->p.getYear()<2016);
        System.out.println(dates);
    }
}
