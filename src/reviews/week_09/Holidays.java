package reviews.week_09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Holidays {
    public static ArrayList<LocalDate> getHolidays(){

        ArrayList<LocalDate> holidays = new ArrayList<>(Arrays.asList(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 16),
                LocalDate.of(2023, 2, 20),
                LocalDate.of(2023, 4, 9),
                LocalDate.of(2023, 4, 16),
                LocalDate.of(2023, 5, 29),
                LocalDate.of(2023, 6, 19),
                LocalDate.of(2023, 7, 4),
                LocalDate.of(2023, 9, 4),
                LocalDate.of(2023, 10, 9),
                LocalDate.of(2023, 11, 10),
                LocalDate.of(2023, 11, 23),
                LocalDate.of(2023, 12, 25)
        ));

        return holidays;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Which month do you want to check the dates for? num");
        int inputMonth=sc.nextInt();
       // DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM - dd, yy");
        for(LocalDate each:getHolidays()){
            if(each.getMonthValue()==inputMonth){
                System.out.println(each.format(DateTimeFormatter.ofPattern("MMM - d, yyyy")));
                System.out.println(each.format(DateTimeFormatter.ofPattern("MMMM - d, yy")));
                System.out.println(each.format(DateTimeFormatter.ofPattern("MM - d, yy")));
            }
        }
    }
}
