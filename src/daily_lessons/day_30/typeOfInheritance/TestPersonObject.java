package daily_lessons.day_30.typeOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Student student= new Student("Kevin",45,'M', LocalDate.of(2021,5,12),'A',"asd123");
        President president= new President("Charles",45,'M',LocalDate.of(1975,2,12),LocalDate.of(2022,5,25));
        Teacher teacher= new Teacher("Ismail",39,'M',LocalDate.of(1984,05,02),"Physic","asdfe456",40000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.lie();


        student.drink("waser");
        teacher.drink("tea");
        president.drink("smoothie");

    }
}
