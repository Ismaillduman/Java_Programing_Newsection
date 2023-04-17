package daily_lessons.day_30.typeOfInheritance;

import java.time.LocalDateTime;

public class Person {
    private String name;
    private int age;
    private  char gender;
    private LocalDateTime DOB;

    public Person(String name, int age, char gender, LocalDateTime DOB) {
       setAge(LocalDateTime.now().getYear()-DOB.getYear());
       setName(name);
       setDOB(DOB);
       setGender(gender);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("age can not be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }

    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }
}
