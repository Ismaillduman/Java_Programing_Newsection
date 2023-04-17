package daily_lessons.day_30.typeOfInheritance;

import java.time.LocalDateTime;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, LocalDateTime DOB, String jobTitle, String employeeId, double salary) {
        super(name, age, gender, DOB, jobTitle, employeeId, salary);
    }



    public void teach(){
        System.out.println(getName()+" is teaching");
    }
}
