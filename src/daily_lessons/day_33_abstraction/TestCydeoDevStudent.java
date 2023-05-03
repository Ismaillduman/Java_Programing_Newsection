package daily_lessons.day_33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudent  {
    public static void main(String[] args) {
        CydeoDevStudent student1= new CydeoDevStudent("John",'M', LocalDate.of(1984,02,05),"asdf1245","zero to hero",29);
        System.out.println(student1);
        student1.drink();
        student1.eat();
        student1.sleep();
        student1.breath();
    }
}
