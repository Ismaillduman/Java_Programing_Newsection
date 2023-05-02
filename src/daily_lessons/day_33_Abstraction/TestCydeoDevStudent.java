package daily_lessons.day_33_Abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudent  {
    public static void main(String[] args) {
        CydeoDevStudent cydeoDevStudent= new CydeoDevStudent("John",'M', LocalDate.of(1984,02,05),"asdf1245","EU",29);
        System.out.println(cydeoDevStudent);
    }
}
