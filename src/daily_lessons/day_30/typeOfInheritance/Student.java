package daily_lessons.day_30.typeOfInheritance;

import java.time.LocalDate;

public class Student extends Person {
     private char grade;
     private  String id;

    public Student(String name, int age, char gender, LocalDate DOB, char grade, String id) {
        super(name, age, gender, DOB);
        setGrade(grade);
        setId(id);

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  void study(){
        System.out.println(getName()+" is studying");
     }
}
