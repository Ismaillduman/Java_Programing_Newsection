package day_12;

public class SalaryCal {

    public static void main(String[] args) {
        salary(25,45);
    }
    public static void salary(double hourlyRate, int weeklyHours){
        /*Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0*/

        double grossIncome= hourlyRate*weeklyHours*4*12;
        System.out.println("You make $"+hourlyRate+" per hour"+" You work "+weeklyHours+" hours in a week "+
                "Your gross income is $"+grossIncome);
    }
}
