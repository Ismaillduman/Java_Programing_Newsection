package office_hours.week_10;


import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Scanner;

public class T1Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what year do you  want to create the reservation?");
        int year = sc.nextInt();
        System.out.println("what month do you want to create the reservation");
        int month = sc.nextInt();
        System.out.println("what day do you want to create the reservation");
        int day = sc.nextInt();
        System.out.println(" what hour do you want to create it");
        int hour = sc.nextInt();

        sc.close();

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, 0);

        if (dateTime.getYear() != 2023) {
            System.out.println("Sorry we cannot make a reservation for the year: " + year);
            System.exit(1);
        }
//        if(dateTime.getDayOfYear()<LocalDate.now().getDayOfYear()){
//            System.out.println("Sorry this date has already passed");
//            System.exit(1);
//        }
        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println("Sorry this date has already passed");
            System.exit(1);
        }

        if (dateTime.getMonthValue() == 11 && dateTime.getDayOfMonth() == 23 || dateTime.getMonthValue() == 12 && dateTime.getDayOfMonth() == 24) {

            System.out.println("Sorry this date is all booked");
            System.exit(1);
        }

        boolean validTime = dateTime.getHour() < 14 || dateTime.getHour() > 20;
        int dayOfWeek = dateTime.getDayOfWeek().getValue();
        boolean onWeekend = dayOfWeek == 5 || dayOfWeek == 6 || dayOfWeek == 7;

        if (validTime && onWeekend) {
            System.out.println("Book for " + dateTime);
        } else {
            if (!validTime) {
                System.out.println("Sorry we close at 11 on weekends");
            }
            if (!onWeekend) {
                System.out.println("Sorry we only have availability on weekends");
            }
        }
    }


}
