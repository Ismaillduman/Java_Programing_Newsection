package daily_lessons.day_32_final_keyword.person;

import java.time.LocalDate;

public class TestPersonObj {
    public static void main(String[] args) {
        Person person=new Person("Ismail",'M', LocalDate.of(1984,02,05));
        System.out.println(person);
        Employee employee=new Employee("Sam",'M',LocalDate.of(2003,2,6),50000,"Sdet");
        System.out.println(employee);

    }
}
