package daily_lessons.day_24_arrayList_continue;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today= LocalDate.now();

        System.out.println(today);

        LocalDate birthday= LocalDate.of(1983, 9, 23);
        System.out.println(birthday);

        System.out.println("----------------------------------");
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(birthday.getMonth());
        System.out.println(birthday.getMonthValue());
        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println("------------------------------");

       today=today.plusYears(1);
        System.out.println(today);
        System.out.println("---------------------------");
        LocalDate graduateDate= LocalDate.of(2008,7,20);

        graduateDate.plusYears(1);
        System.out.println(graduateDate);
        graduateDate=graduateDate.plusYears(1);
        System.out.println(graduateDate);
        graduateDate=graduateDate.plusMonths(7);
        System.out.println(graduateDate);
        graduateDate=graduateDate.plusWeeks(7);
        System.out.println(graduateDate);

       graduateDate= graduateDate.plusDays(100);
        System.out.println(graduateDate);
        System.out.println("---------------------------------------");

        LocalDate yusufsBirthDate= LocalDate.of(2015,5,12);
LocalDate busrasBirthDate= yusufsBirthDate.minusYears(3).plusMonths(6).plusDays(13);
        System.out.println("Yusufs Birth Date = " + yusufsBirthDate);
        System.out.println("Busra's birth date: "+busrasBirthDate);
        System.out.println("--------------------------------------");

        LocalDate birthday1= LocalDate.of(1994,7,7);
        LocalDate birthday2= LocalDate.of(1995,6,7);

       boolean r1=  birthday1.isEqual(birthday2);
        System.out.println(r1);
        System.out.println("----------------------------------------------");
        LocalDate grad_cydeo= LocalDate.of(2023,1,2);

        System.out.println(grad_cydeo.isBefore(LocalDate.of(2022,12,31))); //false
        System.out.println(grad_cydeo.isAfter(LocalDate.of(2022,12,31))); //true
        System.out.println("---------------------------------------------------");
        System.out.println(LocalDate.of(2022,6,16).isLeapYear());


    }
}
