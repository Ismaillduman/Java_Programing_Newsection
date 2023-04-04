package practiseTasks.day_24;

import java.time.LocalDate;

public class LeapYear {

    public static boolean leapYear(int birthYear){
        LocalDate birthDate= LocalDate.of(birthYear,1,1);
        boolean r1= birthDate.isLeapYear();

        return r1;
    }
    public static void main(String[] args) {
        /*Create a function that accepts an int argument birthYear, return true if the person was born on leap year,
otherwise return false*/
        System.out.println(leapYear(2015));
    }
}
